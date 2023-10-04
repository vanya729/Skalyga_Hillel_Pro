package com.shop.service;

import com.shop.dto.OrderDto;
import com.shop.dto.OrderResponse;
import com.shop.entity.Order;

import java.util.List;

public interface OrderService {

    Order getOrderById(Integer id);
    List<Order> getAllOrders();
    Integer addOrder(OrderDto products);

}
