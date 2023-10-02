package com.template.controller;

import com.template.service.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/cache")
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    private final OrderRepository orderRepository;

//    @PostMapping("/{cache}/{key}/{value}")
//    public boolean putToCachePath(@PathVariable("cache") String cache,
//                                  @PathVariable("key") String key,
//                                  @PathVariable("value") String value) {
//        log.info("Calling method putToCachePath...");
//        return orderRepository.putIntoCache(cache, key, value);
//    }

    @GetMapping("/{cache}/{orderId}")
    public String getOrderById(@PathVariable("cache") String cache,
                               @PathVariable("orderId") String orderId) {
        log.info("Calling method getOrderById...");
        return orderRepository.getOrderById(cache, orderId);
    }

    @GetMapping("/{cache}")
    public Map<String, String> getAllOrders(@PathVariable("cache") String cache) {
        log.info("Calling method getAllOrders...");
        return orderRepository.getAllOrders(cache);
    }


}
