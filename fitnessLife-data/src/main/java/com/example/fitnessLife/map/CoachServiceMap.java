package com.example.fitnessLife.map;

import com.example.fitnessLife.model.Coach;
import com.example.fitnessLife.model.Sport;
import com.example.fitnessLife.services.CoachService;
import com.example.fitnessLife.services.SportService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class CoachServiceMap extends AbstractMapService<Coach, Long> implements CoachService {
    private final SportService sportService;

    public CoachServiceMap(SportService sportService) {
        this.sportService = sportService;
    }

    @Override
    public Coach findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Coach save(Coach coach) {
        if (coach.getTypesOfSport().size() > 0) {
            coach.getTypesOfSport().forEach(sport -> {
                if (sport.getId() == null) {
                    Sport savedSport = sportService.save(sport);
                    sport.setId(savedSport.getId());
                }
            });
        }
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
