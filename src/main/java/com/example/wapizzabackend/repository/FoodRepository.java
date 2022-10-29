package com.example.wapizzabackend.repository;

import com.example.wapizzabackend.model.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
