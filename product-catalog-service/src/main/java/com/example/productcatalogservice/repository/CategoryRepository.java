package com.example.productcatalogservice.repository;

import com.example.productcatalogservice.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}