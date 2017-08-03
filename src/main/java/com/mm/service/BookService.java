package com.mm.service;

import com.mm.entity.Book;

import java.util.List;


public interface BookService {
    void save(Book book);
    List<Book> findAll();
    void delete(Long id);
    Book findOne(Long id);
}
