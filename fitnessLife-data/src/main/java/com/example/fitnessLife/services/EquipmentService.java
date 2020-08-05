package com.example.fitnessLife.services;

import com.example.fitnessLife.model.Equipment;
import com.example.fitnessLife.model.Sportsman;

import java.util.Set;

public interface EquipmentService {
    Equipment findById (Long id);
    Equipment save (Equipment equipment);
    Set<Equipment> findAll();
}
