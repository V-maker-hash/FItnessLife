package com.example.fitnessLife.springDataJPA;

import com.example.fitnessLife.model.EquipmentType;
import com.example.fitnessLife.reposotories.EquipmentTypeRepository;
import com.example.fitnessLife.services.EquipmentTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springDataJPA")
public class EquipmentTypeJpaService implements EquipmentTypeService {

    private final EquipmentTypeRepository equipmentTypeRepository;

    public EquipmentTypeJpaService(EquipmentTypeRepository equipmentTypeRepository) {
        this.equipmentTypeRepository = equipmentTypeRepository;
    }


    @Override
    public EquipmentType findById(Long aLong) {
        return equipmentTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public EquipmentType save(EquipmentType equipmentType) {
        return equipmentTypeRepository.save(equipmentType);
    }

    @Override
    public Set<EquipmentType> findAll() {
        Set<EquipmentType> equipmentTypeSet = new HashSet<>();
        equipmentTypeRepository.findAll().forEach(equipmentTypeSet::add);
        return equipmentTypeSet;
    }

    @Override
    public void delete(EquipmentType equipmentType) {
        equipmentTypeRepository.delete(equipmentType);
    }

    @Override
    public void deleteById(Long aLong) {
        equipmentTypeRepository.deleteById(aLong);
    }
}
