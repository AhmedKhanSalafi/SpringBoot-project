package com.example.multupleDb.postgress.entity.repo;

import com.example.multupleDb.postgress.entity.Product;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

    Product findByTitle(String title);
}
