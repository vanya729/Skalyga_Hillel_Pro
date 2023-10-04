package com.shop.service.impl;

import com.shop.dto.ProductDto;
import com.shop.entity.Product;
import com.shop.exceptions.ProductNotFoundException;
import com.shop.repository.ProductRepository;
import com.shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
    @Override
    public Integer addProduct(ProductDto productDto) {
        Product product = new Product()
                .setName(productDto.getName())
                .setCost(productDto.getCost());
        return productRepository.save(product).getId();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("PRODUCT NOT FOUND")
                );
    }
}
