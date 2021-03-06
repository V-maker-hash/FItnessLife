package com.example.fitnessLife.map;

import com.example.fitnessLife.model.Equipment;
import com.example.fitnessLife.services.EquipmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
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
