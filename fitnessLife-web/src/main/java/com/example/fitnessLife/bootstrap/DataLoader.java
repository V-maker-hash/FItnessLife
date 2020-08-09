package com.example.fitnessLife.bootstrap;

import com.example.fitnessLife.model.Coach;
import com.example.fitnessLife.model.EquipmentType;
import com.example.fitnessLife.model.Sportsman;
import com.example.fitnessLife.services.CoachService;
import com.example.fitnessLife.services.EquipmentTypeService;
import com.example.fitnessLife.services.SportsmanService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final SportsmanService sportsmanService;
    private final CoachService coachService;
    private final EquipmentTypeService equipmentTypeService;

    public DataLoader(SportsmanService sportsmanService, CoachService coachService, EquipmentTypeService equipmentTypeService) {
        this.sportsmanService = sportsmanService;
        this.coachService = coachService;
        this.equipmentTypeService = equipmentTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        EquipmentType equipmentType = new EquipmentType();
        equipmentType.setName("Expander");
        EquipmentType expander = equipmentTypeService.save(equipmentType);

        EquipmentType equipmentType2 = new EquipmentType();
        equipmentType.setName("Swimming Suit");
        EquipmentType swimmingSuit = equipmentTypeService.save(equipmentType2);

        Sportsman sportsman = new Sportsman();
        sportsman.setFirstName("Brad");
        sportsman.setLastName("Pitt");
        sportsmanService.save(sportsman);


        Sportsman sportsman2 = new Sportsman();
        sportsman2.setFirstName("Tim");
        sportsman2.setLastName("Jones");
        sportsmanService.save(sportsman2);

        System.out.println("Loaded sportsmen...");

        Coach coach = new Coach();
        coach.setFirstName("Jimm");
        coach.setLastName("Carter");
        coachService.save(coach);

        Coach coach2 = new Coach();
        coach2.setFirstName("Bob");
        coach2.setLastName("Jones");
        coachService.save(coach2);

        System.out.println("Loaded coaches...");
    }
}
