package com.ufg.data;

import com.ufg.model.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookDAO extends PagingAndSortingRepository<Book, Long> {}