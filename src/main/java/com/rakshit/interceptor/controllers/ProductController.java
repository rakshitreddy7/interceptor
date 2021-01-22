package com.rakshit.interceptor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<String> getProducts() {
        final List<String> products = new ArrayList<>();

        products.add("GPU");
        products.add("CPU");
        products.add("Monitor");
        products.add("Mouse");

        return products;
    }
}
