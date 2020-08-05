package com.example.fitnessLife.services;

import com.example.fitnessLife.model.Sportsman;

import java.util.Set;

public interface SportsmanService {

    Sportsman findByLastName (String lastName);
    Sportsman findById (Long id);
    Sportsman save (Sportsman sportsman);
    Set<Sportsman> findAll();
}
