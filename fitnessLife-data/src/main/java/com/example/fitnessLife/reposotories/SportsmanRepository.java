package com.example.fitnessLife.reposotories;

import com.example.fitnessLife.model.Sportsman;
import org.springframework.data.repository.CrudRepository;

public interface SportsmanRepository extends CrudRepository<Sportsman, Long> {
    Sportsman findByLastName(String lastName);
}
