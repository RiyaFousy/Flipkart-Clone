package com.training.FlipkartClone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.FlipkartClone.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    // You can add custom query methods if needed
}

