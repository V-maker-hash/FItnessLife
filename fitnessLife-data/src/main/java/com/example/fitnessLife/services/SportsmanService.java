package com.example.fitnessLife.services;

import com.example.fitnessLife.model.Sportsman;


public interface SportsmanService extends CrudService<Sportsman, Long> {

    Sportsman findByLastName(String lastName);
}
