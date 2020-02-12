package com.ufg.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Configuration;


@Configuration
@PropertySource(value="classpath:application.properties")
@Controller
public class SimpleController {

    @Value("${spring.application.name}")
    String appName;

    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "index";
    }
}
