package com.example.fitnessLife.springdatajpa;

import com.example.fitnessLife.model.Equipment;
import com.example.fitnessLife.reposotories.EquipmentRepository;
import com.example.fitnessLife.services.EquipmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class EquipmentJpaService implements EquipmentService {

    private final EquipmentRepository equipmentRepository;

    public EquipmentJpaService(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    @Override
    public Equipment findById(Long aLong) {
        return equipmentRepository.findById(aLong).orElse(null);
    }

    @Override
    public Equipment save(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    @Override
    public Set<Equipment> findAll() {
        Set<Equipment> equipmentSet = new HashSet<>();
        equipmentRepository.findAll().forEach(equipmentSet::add);
        return equipmentSet;
    }

    @Override
    public void delete(Equipment equipment) {
        equipmentRepository.delete(equipment);
    }

    @Override
    public void deleteById(Long aLong) {
        equipmentRepository.deleteById(aLong);
    }
}
