package com.template.controller;

import com.template.service.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    private final OrderRepository orderRepository;

    @PostMapping("/{order}/{key}/{value}")
    public boolean putToCachePath(@PathVariable("order") String order,
                                  @PathVariable("key") String key,
                                  @PathVariable("value") String value) {
        log.info("Calling method putToCachePath...");
        return orderRepository.putIntoCache(order, key, value);
    }

    @GetMapping("/{order}/{orderId}")
    public String getOrderById(@PathVariable("order") String order,
                               @PathVariable("orderId") String orderId) {
        log.info("Calling method getOrderById...");
        return orderRepository.getOrderById(order, orderId);
    }

    @GetMapping("/{order}")
    public Map<String, String> getAllOrders(@PathVariable("order") String order) {
        log.info("Calling method getAllOrders...");
        return orderRepository.getAllOrders(order);
    }


}
