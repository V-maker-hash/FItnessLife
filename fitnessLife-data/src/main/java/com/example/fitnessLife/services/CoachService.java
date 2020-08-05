package com.example.fitnessLife.services;

import com.example.fitnessLife.model.Coach;
import com.example.fitnessLife.model.Equipment;

import java.util.Set;

public interface CoachService {
    Coach findById (Long id);
    Coach save (Coach coach);
    Set<Coach> findAll();
}
