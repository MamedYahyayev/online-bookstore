package com.example.demo.repository;


import com.example.demo.model.Book;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;



@CrossOrigin("http://localhost:4200")
public interface BookRepository extends JpaRepository<Book, Long> {

	
	@RestResource(path = "categoryid")
    Page<Book> findByCategoryId(@RequestParam("id") Long id , Pageable pageable);

}
