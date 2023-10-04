package com.shop.controller;

import com.shop.dto.ProductDto;
import com.shop.entity.Product;
import com.shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
@Slf4j
public class ProductController {

    private final ProductService productService;

    @PostMapping("")
    public Integer addNewProduct(@RequestBody ProductDto product){
        log.info("ProductController - run method add new product");
        return productService.addProduct(product);
    }
    @GetMapping("/all")
    public List<Product> getProducts() {
        log.info("ProductController - run method get all Products...");
        return productService.getProducts();
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id) {
        log.info("ProductController - run method get product by id");
        return productService.getProductById(id);
    }
}
