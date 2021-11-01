package com.flamexander.cloud.client.services;

import com.flamexander.contract.entities.Category;
import com.flamexander.contract.entities.Product;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<> ();

        for (int i = 0; i < 100; i++) {

            Category category = new Category ();
            category.setId (1L);
            category.setTitle ("category");

            Product product = new Product ();
            product.setId ((long) i + 1);
            product.setCategory (category);
            product.setTitle ("product " + product.getId ());
            product.setShortDescription ("setShortDescription");
            product.setFullDescription ("setFullDescription");
            product.setVendorCode ("setVendorCode");
            product.setCreateAt (LocalDateTime.now ());

            products.add (product);
        }

        return products;
    }

}
