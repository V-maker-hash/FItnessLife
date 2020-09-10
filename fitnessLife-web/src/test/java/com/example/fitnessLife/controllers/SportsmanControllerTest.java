package com.example.fitnessLife.controllers;

import com.example.fitnessLife.model.Sportsman;
import com.example.fitnessLife.services.SportsmanService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class SportsmanControllerTest {

    @Mock
    SportsmanService sportsmanService;
    @InjectMocks
    SportsmanController sportsmanController;

    Set<Sportsman> sportsmenSet;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        sportsmenSet = new HashSet<>();
        sportsmenSet.add(Sportsman.builder().id(1L).build());
        sportsmenSet.add(Sportsman.builder().id(2L).build());

        mockMvc = MockMvcBuilders.standaloneSetup(sportsmanController).build();
    }

    @Test
    void listSportsmen() throws Exception {

        when(sportsmanService.findAll()).thenReturn(sportsmenSet);
        mockMvc.perform(MockMvcRequestBuilders.get("/sportsman/index"))
                .andExpect(status().isOk())
                .andExpect(view().name("sportsman/index"))
                .andExpect(model().attribute("sportsman", hasSize(2)));
    }


}