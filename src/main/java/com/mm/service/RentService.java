package com.mm.service;

import com.mm.entity.Book;
import com.mm.entity.Rent;
import com.mm.entity.User;

import java.util.List;



public interface RentService {
    void createRent(User user, Book book);
    List<Rent> findAll();
    List<Rent> findByUserOrderByCreatedDateDesc(User user);
}
