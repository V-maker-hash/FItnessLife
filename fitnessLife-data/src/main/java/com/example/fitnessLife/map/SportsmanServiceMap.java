package com.example.fitnessLife.map;

import com.example.fitnessLife.model.Sportsman;
import com.example.fitnessLife.services.AbstractMapService;
import com.example.fitnessLife.services.CrudService;

import java.util.Set;

public class SportsmanServiceMap extends AbstractMapService<Sportsman, Long> implements CrudService<Sportsman, Long> {


    @Override
    public Sportsman findbyId(Long aLong) {
        return super.findbyId(aLong);
    }

    @Override
    public Sportsman save(Long aLong, Sportsman sportsman) {
        return super.save(aLong, sportsman);
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
}
