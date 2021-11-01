package com.flamexander.cloud.client.feign;

import com.flamexander.contract.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("geek-spring-cloud-eureka-client")
public interface GreetingClient {

    @RequestMapping("/get-products")
    List<Product> getProducts();
}
