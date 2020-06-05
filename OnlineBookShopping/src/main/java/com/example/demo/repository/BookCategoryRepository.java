package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BookCategory;

@Repository()
@RepositoryRestResource(collectionResourceRel = "bookCategory" , path = "book-category") //Change Url Path and Class Name in json format 
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{
	
}
