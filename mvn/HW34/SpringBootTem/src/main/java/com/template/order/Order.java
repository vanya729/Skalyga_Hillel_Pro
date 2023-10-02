package com.template.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private long id;
    private String date;
    private double cost;
    private List<Product> products;

}