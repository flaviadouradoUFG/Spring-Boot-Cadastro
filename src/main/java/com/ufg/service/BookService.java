package com.ufg.service;

import com.ufg.data.BookDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO; //chamando o banco no service

    static final Logger logger = LoggerFactory.getLogger(BookService.class);

    //CRUD book
}
