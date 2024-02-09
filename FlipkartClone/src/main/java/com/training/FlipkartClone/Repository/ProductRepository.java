package com.training.FlipkartClone.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.FlipkartClone.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    // You can add custom query methods if needed
}
