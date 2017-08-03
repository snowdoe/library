package com.mm.dao;

import com.mm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    //zwraca uzyttkownika na podstawie loginu
    User findByEmail(String email);
}
