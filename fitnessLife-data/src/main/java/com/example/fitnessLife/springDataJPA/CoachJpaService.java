package com.example.fitnessLife.springDataJPA;

import com.example.fitnessLife.model.Coach;
import com.example.fitnessLife.reposotories.CoachRepository;
import com.example.fitnessLife.services.CoachService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springDataJPA")
public class CoachJpaService implements CoachService {

    private final CoachRepository coachRepository;

    public CoachJpaService(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }

    @Override
    public Coach findById(Long aLong) {
        Coach coach = coachRepository.findById(aLong).orElse(null);
        return coach;
    }

    @Override
    public Coach save(Coach coach) {
        return null;
    }

    @Override
    public Set<Coach> findAll() {
        Set<Coach> coachSet = new HashSet<>();
        coachRepository.findAll().forEach(coachSet::add);
        return coachSet;
    }

    @Override
    public void delete(Coach coach) {
        coachRepository.delete(coach);
    }

    @Override
    public void deleteById(Long aLong) {
        coachRepository.deleteById(aLong);
    }
}
