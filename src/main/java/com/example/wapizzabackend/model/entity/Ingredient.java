package com.example.wapizzabackend.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Ingredient {

    @Id
    private Long id;

    private String name;

    private double cost;

}
