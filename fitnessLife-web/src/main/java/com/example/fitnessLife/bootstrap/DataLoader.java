package com.example.fitnessLife.bootstrap;

import com.example.fitnessLife.model.Coach;
import com.example.fitnessLife.model.Sportsman;
import com.example.fitnessLife.services.CoachService;
import com.example.fitnessLife.services.SportsmanService;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {

SportsmanService sportsmanService;
CoachService coachService;

    public DataLoader(SportsmanService sportsmanService, CoachService coachService) {
        this.sportsmanService = sportsmanService;
        this.coachService = coachService;
    }

    @Override
    public void run(String... args) throws Exception {

        Sportsman sportsman = new Sportsman();
        sportsman.setId(1L);
        sportsman.setFirstName("Brad");
        sportsman.setLastName("Pitt");
        sportsmanService.save(sportsman);


        Sportsman sportsman2 = new Sportsman();
        sportsman2.setId(2L);
        sportsman2.setFirstName("Tim");
        sportsman2.setLastName("Jones");
        sportsmanService.save(sportsman2);

        System.out.println("Loaded sportsmen...");

        Coach coach = new Coach();
        coach.setId(1L);
        coach.setFirstName("Jimm");
        coach.setLastName("Carter");
        coachService.save(coach);

        Coach coach2 = new Coach();
        coach2.setId(2L);
        coach2.setFirstName("Bob");
        coach2.setLastName("Jones");
        coachService.save(coach2);

        System.out.println("Loaded coaches...");
    }
}
