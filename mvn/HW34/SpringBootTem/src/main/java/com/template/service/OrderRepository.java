package com.template.service;

import com.template.order.Order;

import java.util.List;
import java.util.Map;

public interface OrderRepository {

    public boolean putIntoCache(String cache, String key, String value);
    public String getOrderById(String cache, String orderId);
    public Map<String, String> getAllOrders(String cache);
}
