package com.vinitha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinitha.user.Book;



@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
