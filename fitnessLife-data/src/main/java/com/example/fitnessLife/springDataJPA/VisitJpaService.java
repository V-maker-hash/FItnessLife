package com.example.fitnessLife.springDataJPA;

import com.example.fitnessLife.model.Visit;
import com.example.fitnessLife.reposotories.VisitRepository;
import com.example.fitnessLife.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springDataJpa")
public class VisitJpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visitSet = new HashSet<>();
        visitRepository.findAll().forEach(visitSet::add);
        return visitSet;
    }

    @Override
    public void delete(Visit visit) {
        visitRepository.delete(visit);

    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
