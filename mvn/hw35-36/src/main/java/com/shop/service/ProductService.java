package com.shop.service;

import com.shop.dto.ProductDto;
import com.shop.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();

    Integer addProduct(ProductDto product);

    Product getProductById(Integer id);

}
