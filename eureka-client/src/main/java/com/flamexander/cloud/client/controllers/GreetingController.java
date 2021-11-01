package com.flamexander.cloud.client.controllers;

import com.flamexander.contract.entities.Product;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface GreetingController {

    @RequestMapping("/get-products")
    List<Product> getProducts();
}
