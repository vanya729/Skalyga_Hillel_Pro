package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class OrderResponse {

    private String name;
    private double sum;
    private List<ProductDto> products;

}
