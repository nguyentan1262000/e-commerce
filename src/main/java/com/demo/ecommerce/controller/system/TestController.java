package com.demo.ecommerce.controller.system;

import com.demo.ecommerce.entity.Product;
import com.demo.ecommerce.service.ProductServiceIPLM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    ProductServiceIPLM serviceIPLM;

    @GetMapping("/home")
    public String home(){
        return "Hello World!";
    }
    @GetMapping("/user")
    public String user(){
        return "Hello user!";
    }
    @GetMapping("/admin")
    public String admin(){
        return "Hello admin!";
    }

}
