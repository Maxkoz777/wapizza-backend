package com.example.wapizzabackend.repository;

import com.example.wapizzabackend.model.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
