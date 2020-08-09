package com.example.fitnessLife.map;

import com.example.fitnessLife.model.EquipmentType;
import com.example.fitnessLife.services.EquipmentTypeService;

import java.util.Set;

public class EquipmentTypeServiceMap extends AbstractMapService <EquipmentType,Long> implements EquipmentTypeService {
    @Override
    public EquipmentType findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public EquipmentType save(EquipmentType equipmentType) {
        return super.save(equipmentType);
    }

    @Override
    public Set findAll() {
        return super.findAll();
    }

    @Override
    public void delete(EquipmentType equipmentType) {
        super.delete(equipmentType);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public Long getNextId() {
        return super.getNextId();
    }
}
