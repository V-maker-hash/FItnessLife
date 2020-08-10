package com.example.fitnessLife.map;

import com.example.fitnessLife.map.AbstractMapService;
import com.example.fitnessLife.model.Sport;
import com.example.fitnessLife.services.SportService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SportServiceMap extends AbstractMapService<Sport, Long> implements SportService {
    @Override
    public Sport findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Sport save(Sport sport) {
        return super.save(sport);
    }

    @Override
    public Set<Sport> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Sport sport) {
        super.delete(sport);
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
