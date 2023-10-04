package com.shop.service.impl;

import com.shop.dto.OrderDto;
import com.shop.entity.Order;
import com.shop.entity.Product;
import com.shop.exceptions.OrderNotFoundException;
import com.shop.exceptions.ProductNotFoundException;
import com.shop.repository.OrderRepository;
import com.shop.repository.ProductRepository;
import com.shop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;
import java.util.List;


@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    @Override
    public Order getOrderById(Integer id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new OrderNotFoundException("ORDER_NOT_FOUND")
                );
        order.setCost(calcOrderCost(order.getProducts()));
        return order;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Integer addOrder(OrderDto orderDto) {
        List<Product> products = getProductsList(orderDto.getProducts());
        Order order = new Order()
                .setDate(new Timestamp(System.currentTimeMillis()))
                .setName(orderDto.getName())
                .setProducts(products);
        order.setCost(calcOrderCost(products));
        return orderRepository.save(order).getId();
    }
    private Double calcOrderCost(List<Product> products) {
        return products.stream().mapToDouble(Product::getCost).sum();
    }

    private List<Product> getProductsList(List<Integer> listProducts) {
        List<Product> products = productRepository.findAllById(listProducts);
        List<Integer> getAllProductList = products.stream().map(Product::getId).toList();
        listProducts.removeAll(getAllProductList);
        if (!listProducts.isEmpty()) {
            throw new ProductNotFoundException("Could not found products with id: " + listProducts);
        }
        return products;
    }
}
