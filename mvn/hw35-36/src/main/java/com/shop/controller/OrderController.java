package com.shop.controller;

import com.shop.dto.OrderDto;
import com.shop.dto.OrderResponse;
import com.shop.entity.Order;
import com.shop.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    private final OrderService orderService;


    @GetMapping("/{id}")
    public Order getOrderByIdController(@PathVariable("id") Integer id) {
        log.info("Run method get from Order by id.");
        return orderService.getOrderById(id);
    }

    @GetMapping("/all")
    public List<Order> getAllOrdersController() {
        log.info("Run method get all orders");
        return orderService.getAllOrders();
    }

    @PostMapping("")
    public Integer addOrderController(@RequestBody OrderDto orderDto) {
        log.info("Run method add order");
        return orderService.addOrder(orderDto);
    }



}
