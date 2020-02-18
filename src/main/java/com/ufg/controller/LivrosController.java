package com.ufg.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books") //Mapeando endpoint
public class LivrosController {

    static final Logger logger = LoggerFactory.getLogger(LivrosController.class);

}
