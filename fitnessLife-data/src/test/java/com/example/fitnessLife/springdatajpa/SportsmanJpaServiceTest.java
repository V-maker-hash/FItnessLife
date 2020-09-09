package com.example.fitnessLife.springdatajpa;

import com.example.fitnessLife.model.Sportsman;
import com.example.fitnessLife.reposotories.EquipmentRepository;
import com.example.fitnessLife.reposotories.EquipmentTypeRepository;
import com.example.fitnessLife.reposotories.SportsmanRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SportsmanJpaServiceTest {

    @Mock
    SportsmanRepository sportsmanRepository;
    @Mock
    EquipmentRepository equipmentRepository;
    @Mock
    EquipmentTypeRepository equipmentTypeRepository;

    @InjectMocks
    SportsmanJpaService sportsmanJpaService;

    Sportsman sportsmanReturn;

    @BeforeEach
    void setUp() {
        sportsmanReturn = Sportsman.builder().id(1L).lastName("Wilson").build();
    }

    @Test
    void findByLastName() {
        when(sportsmanRepository.findByLastName(any())).thenReturn(sportsmanReturn);
        Sportsman sportsman = sportsmanJpaService.findByLastName("Wilson");

        assertEquals("Wilson", sportsman.getLastName());
        verify(sportsmanRepository).findByLastName(any());
    }

    @Test
    void findById() {
        when(sportsmanRepository.findById(anyLong())).thenReturn(Optional.of(sportsmanReturn));
        Sportsman sportsman = sportsmanJpaService.findById(1L);
        assertNotNull(sportsman);
    }

    @Test
    void findByIdNotFound() {
        when(sportsmanRepository.findById(anyLong())).thenReturn(Optional.empty());
        Sportsman sportsman = sportsmanJpaService.findById(1L);
        assertNull(sportsman);
    }

    @Test
    void save() {
        Sportsman sportsmanToSave = Sportsman.builder().id(1L).build();
        when(sportsmanRepository.save(any())).thenReturn(sportsmanReturn);

        Sportsman sportsman = sportsmanJpaService.save(sportsmanToSave);
        assertNotNull(sportsman);
    }

    @Test
    void findAll() {
        Set<Sportsman> returnSportsmanSet = new HashSet<>();
        returnSportsmanSet.add(Sportsman.builder().id(1L).lastName("Wilson").build());
        returnSportsmanSet.add(Sportsman.builder().id(1L).lastName("Hortman").build());
        when(sportsmanRepository.findAll()).thenReturn(returnSportsmanSet);

        Set<Sportsman> set = sportsmanJpaService.findAll();
        assertNotNull(set);
        assertEquals(2, set.size());

    }

    @Test
    void delete() {
        sportsmanJpaService.delete(sportsmanReturn);
        verify(sportsmanRepository, times(1)).delete(any());
    }

    @Test
    void deleteById() {
        sportsmanJpaService.deleteById(1L);
        verify(sportsmanRepository).deleteById(anyLong());

    }
}