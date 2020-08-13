package com.example.fitnessLife.map;

import com.example.fitnessLife.model.Visit;
import com.example.fitnessLife.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Visit findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getEquipment() == null || visit.getEquipment().getSportsman() == null || visit.getEquipment().getId() == null
                || visit.getEquipment().getSportsman().getId() == null) {
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(visit);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
