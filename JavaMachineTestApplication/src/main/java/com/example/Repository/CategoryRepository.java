package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Category;

@Repository
public interface CategoryRepository  extends  JpaRepository<Category,Integer>{
	

     
	

}