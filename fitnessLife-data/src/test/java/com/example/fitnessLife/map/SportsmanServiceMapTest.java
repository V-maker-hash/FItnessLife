package com.example.fitnessLife.map;

import com.example.fitnessLife.model.Sportsman;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SportsmanServiceMapTest {

    SportsmanServiceMap sportsmanServiceMap;
    public final Long sportsmanId = 1L;
    public final String name = "Wilson";

    @BeforeEach
    void setUp() {
        sportsmanServiceMap = new SportsmanServiceMap(new EquipmentTypeServiceMap(), new EquipmentServiceMap());
        sportsmanServiceMap.save(Sportsman.builder().id(sportsmanId).lastName(name).build());
    }

    @Test
    void findById() {
        Sportsman sportsman = sportsmanServiceMap.findById(sportsmanId);
        assertEquals(sportsmanId, sportsman.getId());
    }

    @Test
    void saveExistingId() {
        Long id = 2L;
        Sportsman sportsman = Sportsman.builder().id(id).build();
        Sportsman savedSportsman = sportsmanServiceMap.save(sportsman);
        assertEquals(id, savedSportsman.getId());
    }

    @Test
    void saveNoId() {
        Sportsman sportsman = Sportsman.builder().build();
        Sportsman savedSportsman = sportsmanServiceMap.save(sportsman);
        assertNotNull(savedSportsman.getId());
        assertNotNull(savedSportsman);
    }

    @Test
    void findAll() {
        Set<Sportsman> sportsmanSet = sportsmanServiceMap.findAll();
        assertEquals(1, sportsmanSet.size());
    }

    @Test
    void delete() {
        sportsmanServiceMap.delete(sportsmanServiceMap.findById(sportsmanId));
        assertEquals(0, sportsmanServiceMap.findAll().size());
    }

    @Test
    void deleteById() {
        sportsmanServiceMap.deleteById(sportsmanId);
        assertEquals(0, sportsmanServiceMap.findAll().size());
    }

    @Test
    void findByLastName() {
        Sportsman sportsman = sportsmanServiceMap.findByLastName(name);
        assertNotNull(sportsman);
    }
}