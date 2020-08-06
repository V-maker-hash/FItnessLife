package com.example.fitnessLife.map;

import com.example.fitnessLife.model.Equipment;
import com.example.fitnessLife.services.AbstractMapService;
import com.example.fitnessLife.services.CrudService;

import java.util.Set;

public class EquipmentServiceMap extends AbstractMapService<Equipment, Long> implements CrudService<Equipment, Long> {
    @Override
    public Equipment findbyId(Long aLong) {
        return super.findbyId(aLong);
    }

    @Override
    public Equipment save(Long aLong, Equipment equipment) {
        return super.save(aLong, equipment);
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
