package com.example.fitnessLife.map;

import com.example.fitnessLife.model.Sportsman;
import com.example.fitnessLife.services.AbstractMapService;
import com.example.fitnessLife.services.SportsmanService;

import java.util.Set;

public class SportsmanServiceMap extends AbstractMapService<Sportsman, Long> implements SportsmanService {


    @Override
    public Sportsman findbyId(Long aLong) {
        return super.findbyId(aLong);
    }

    @Override
    public Sportsman save(Sportsman sportsman) {
        return super.save(sportsman.getId(), sportsman);
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