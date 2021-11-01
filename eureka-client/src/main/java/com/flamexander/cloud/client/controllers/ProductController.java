package com.flamexander.cloud.client.controllers;

import com.flamexander.cloud.client.services.ProductService;
import com.flamexander.contract.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController implements GreetingController{

    @Autowired
    private ProductService service;

    @Override
    public List<Product> getProducts () {
        return service.getAllProducts();
    }
}
