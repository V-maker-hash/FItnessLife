package com.example.fitnessLife.map;

import com.example.fitnessLife.model.Equipment;
import com.example.fitnessLife.services.EquipmentService;

import java.util.Set;

public class EquipmentServiceMap extends AbstractMapService<Equipment, Long> implements EquipmentService {
    @Override
    public Equipment findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Equipment save(Equipment equipment) {
        return super.save(equipment);
    }

    @Override
    public Set<Equipment> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Equipment equipment) {
        super.delete(equipment);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
