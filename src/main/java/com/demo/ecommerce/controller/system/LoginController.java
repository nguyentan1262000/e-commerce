package com.demo.ecommerce.controller.system;

import com.demo.ecommerce.entity.User;
import com.demo.ecommerce.service.UserServiceIPLM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private UserServiceIPLM serviceIPLM;

}
