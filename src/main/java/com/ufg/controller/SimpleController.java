package com.ufg.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class SimpleController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleController.class);

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("appName", appName);
        LOGGER.info("------> APPNAME: " + appName);
        return "index"; // view
    }
}
