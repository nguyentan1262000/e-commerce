package com.demo.ecommerce.controller.system;

import com.demo.ecommerce.service.ProductServiceIPLM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    ProductServiceIPLM serviceIPLM;

    @GetMapping("/test")
    public String getHome(Model model){
        model.addAttribute("name","Nguyen An");
        model.addAttribute("age",18);
        System.out.println("pleaseeeeee........");
        return "home";
    }

    @GetMapping("/page")
    public String getIndex(Model model){
        return "index";
    }
    @GetMapping("/admin/login")
    public String adminLoginPage(Model model){
        return "admin/admin_login";
    }

    @GetMapping("/user/login")
    public String userLoginPage(Model model){
        return "user/user_login";
    }

    @GetMapping("/admin/home")
    public String viewAdminHomePage(Model model){
        return "admin/admin_home";
    }

}
