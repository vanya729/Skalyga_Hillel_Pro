package com.template.service.impl;

import com.template.order.Order;
import com.template.service.OrderRepository;
import java.util.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderRepositoryImpl implements OrderRepository {

    private Map<String, Map<String, String>> orders;

    public OrderRepositoryImpl() {
        this.orders = new HashMap<>();
    }

    @Override
    public boolean putIntoCache(String order, String key, String value) {
        if (!this.orders.containsKey(order)) {
            this.orders.put(order, new HashMap<>());
        }
        this.orders.get(order).put(key, value);
        log.info(this.orders.toString());
        return true;
    }

    @Override
    public String getOrderById(String order, String orderId) {
        if (this.orders.containsKey(order) && this.orders.get(order).containsKey(orderId)) {
            return this.orders.get(order).get(orderId);
        } else {
            log.warn("Order with ID {} not found in cache {}", orderId, order);
            return null;
        }
    }

    @Override
    public Map<String, String> getAllOrders(String cache) {
        if (this.orders.containsKey(cache)) {
            return this.orders.get(cache);
        } else {
            log.warn("Cache {} not found", cache);
            return Collections.emptyMap();
        }
    }
}
