package com.example.fitnessLife.map;

import com.example.fitnessLife.model.Coach;
import com.example.fitnessLife.services.CoachService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class CoachServiceMap extends AbstractMapService<Coach, Long> implements CoachService {


    @Override
    public Coach findById(Long aLong) {
        return super.findById(aLong);
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
