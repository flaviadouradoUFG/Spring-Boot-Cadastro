package com.ufg.service;

import com.ufg.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public class CadastroService {


    public interface BookRepository extends CrudRepository<Book, Long> {
        List<Book> findByTitle(String title);
    }

}
