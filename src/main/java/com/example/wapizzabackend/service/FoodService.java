package com.example.wapizzabackend.service;

import com.example.wapizzabackend.model.entity.Food;

public interface FoodService {

    /**
     *
     * @param id of pizza
     * @return pizza by id
     */
    Food getPizzaById(Long id);

    /**
     *
     * @param id of drink
     * @return drink by id
     */
    Food getDrinkById(Long id);

    /**
     *
     * @param id of dessert
     * @return dessert by id
     */
    Food getDessertById(Long id);

}
