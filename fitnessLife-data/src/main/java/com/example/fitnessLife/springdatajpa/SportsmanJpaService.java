package com.example.fitnessLife.springdatajpa;

import com.example.fitnessLife.model.Sportsman;
import com.example.fitnessLife.reposotories.EquipmentRepository;
import com.example.fitnessLife.reposotories.EquipmentTypeRepository;
import com.example.fitnessLife.reposotories.SportsmanRepository;
import com.example.fitnessLife.services.SportsmanService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SportsmanJpaService implements SportsmanService {

    private final SportsmanRepository sportsmanRepository;
    private final EquipmentRepository equipmentRepository;
    private final EquipmentTypeRepository equipmentTypeRepository;

    public SportsmanJpaService(SportsmanRepository sportsmanRepository, EquipmentRepository equipmentRepository, EquipmentTypeRepository equipmentTypeRepository) {
        this.sportsmanRepository = sportsmanRepository;
        this.equipmentRepository = equipmentRepository;
        this.equipmentTypeRepository = equipmentTypeRepository;
    }

    @Override
    public Sportsman findByLastName(String lastName) {
        return sportsmanRepository.findByLastName(lastName);
    }

    @Override
    public Sportsman findById(Long aLong) {
        Optional<Sportsman> sportsman = sportsmanRepository.findById(aLong);
        return sportsman.orElse(null);
    }

    @Override
    public Sportsman save(Sportsman sportsman) {
        return sportsmanRepository.save(sportsman);
    }

    @Override
    public Set<Sportsman> findAll() {
        Set<Sportsman> sportsmanSet = new HashSet<>();
        sportsmanRepository.findAll().forEach(sportsmanSet::add);
        return sportsmanSet;
    }

    @Override
    public void delete(Sportsman sportsman) {
        sportsmanRepository.delete(sportsman);

    }

    @Override
    public void deleteById(Long aLong) {
        sportsmanRepository.deleteById(aLong);
    }
}
