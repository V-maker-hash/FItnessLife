package com.example.fitnessLife.services;

import com.example.fitnessLife.model.Sportsman;

import java.util.Set;

public interface SportsmanService extends CrudService<Sportsman, Long> {

    Sportsman findByLastName(String lastName);
    
}
