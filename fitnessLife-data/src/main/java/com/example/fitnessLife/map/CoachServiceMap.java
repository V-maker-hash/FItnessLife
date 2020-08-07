package com.example.fitnessLife.map;

import com.example.fitnessLife.model.Coach;
import com.example.fitnessLife.model.Sportsman;
import com.example.fitnessLife.services.AbstractMapService;
import com.example.fitnessLife.services.CoachService;
import com.example.fitnessLife.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class CoachServiceMap extends AbstractMapService<Coach, Long> implements CoachService {


    @Override
    public Coach findbyId(Long aLong) {
        return super.findbyId(aLong);
    }

    @Override
    public Coach save(Coach coach) {
        return super.save(coach);
    }

    @Override
    public Set<Coach> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Coach coach) {
        super.delete(coach);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
