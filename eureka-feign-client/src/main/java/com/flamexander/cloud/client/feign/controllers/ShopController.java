package com.flamexander.cloud.client.feign.controllers;

import com.flamexander.cloud.client.feign.GreetingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private GreetingClient greetingClient;

    @RequestMapping("")
    public String shop(Model model){
        model.addAttribute ("products", greetingClient.getProducts ());
        return "shop";
    }


}
