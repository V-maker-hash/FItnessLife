package com.example.fitnessLife.map;

import com.example.fitnessLife.model.Equipment;
import com.example.fitnessLife.model.Sportsman;
import com.example.fitnessLife.services.EquipmentService;
import com.example.fitnessLife.services.EquipmentTypeService;
import com.example.fitnessLife.services.SportsmanService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SportsmanServiceMap extends AbstractMapService<Sportsman, Long> implements SportsmanService {

    private final EquipmentTypeService equipmentTypeService;
    private final EquipmentService equipmentService;

    public SportsmanServiceMap(EquipmentTypeService equipmentTypeService, EquipmentService equipmentService) {
        this.equipmentTypeService = equipmentTypeService;
        this.equipmentService = equipmentService;
    }

    @Override
    public Sportsman findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Sportsman save(Sportsman sportsman) {

        if (sportsman == null) {
            if (sportsman.getEquipmentSet() != null) {
                sportsman.getEquipmentSet().forEach(equipment -> {
                    if (equipment.getEquipmentType() != null) {
                        if (equipment.getEquipmentType().getId() == null) {
                            equipment.setEquipmentType(equipmentTypeService.save(equipment.getEquipmentType()));
                        }
                    } else {
                        throw new RuntimeException("Equipment type is required!");
                    }
                    if (equipment.getId() == null) {
                        Equipment savedEquipment = equipmentService.save(equipment);
                        equipment.setId(savedEquipment.getId());
                    }
                });
            }
            return super.save(sportsman);

        } else return null;

    }


    @Override
    public Set<Sportsman> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Sportsman sportsman) {
        super.delete(sportsman);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public Sportsman findByLastName(String lastName) {
        return this.findByLastName(lastName);
    }
}
