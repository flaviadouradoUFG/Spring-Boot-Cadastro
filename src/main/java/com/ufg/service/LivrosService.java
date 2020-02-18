package com.ufg.service;

import com.ufg.repository.LivrosRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LivrosService {

    @Autowired
    private LivrosRepository livrosRepository; //chamando o banco no service

    static final Logger logger = LoggerFactory.getLogger(LivrosService.class);

    //CRUD book
}
