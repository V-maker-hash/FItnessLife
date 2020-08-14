package com.example.fitnessLife.springdatajpa;

import com.example.fitnessLife.model.Sport;
import com.example.fitnessLife.reposotories.SportRepository;
import com.example.fitnessLife.services.SportService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SportJpaService implements SportService {

    private final SportRepository sportRepository;

    public SportJpaService(SportRepository sportRepository) {
        this.sportRepository = sportRepository;
    }


    @Override
    public Sport findById(Long aLong) {
        return sportRepository.findById(aLong).orElse(null);
    }

    @Override
    public Sport save(Sport sport) {
        return sportRepository.save(sport);
    }

    @Override
    public Set<Sport> findAll() {
        Set<Sport> sportSet = new HashSet<>();
        sportRepository.findAll().forEach(sportSet::add);
        return sportSet;
    }

    @Override
    public void delete(Sport sport) {
        sportRepository.delete(sport);
    }

    @Override
    public void deleteById(Long aLong) {

        sportRepository.deleteById(aLong);
    }
}
