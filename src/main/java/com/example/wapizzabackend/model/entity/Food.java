package com.example.wapizzabackend.model.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Food {

    @Id
    private Long id;

    private String name;

    private double cost;

    @Enumerated(EnumType.STRING)
    private FoodType foodType;

}
