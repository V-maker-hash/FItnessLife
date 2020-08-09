package com.example.fitnessLife.bootstrap;

import com.example.fitnessLife.model.Coach;
import com.example.fitnessLife.model.Equipment;
import com.example.fitnessLife.model.EquipmentType;
import com.example.fitnessLife.model.Sportsman;
import com.example.fitnessLife.services.CoachService;
import com.example.fitnessLife.services.EquipmentTypeService;
import com.example.fitnessLife.services.SportsmanService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
        sportsman.setAddress("Baker st.");
        sportsman.setCity("Virginia");
        sportsman.setTelephone("777-77-77");
        sportsmanService.save(sportsman);

        Equipment bradEquipment = new Equipment();
        bradEquipment.setEquipmentType(equipmentType);
        bradEquipment.setSportsman(sportsman);
        bradEquipment.setShoppingDate(LocalDate.now());
        bradEquipment.setName(equipmentType.getName());
        sportsman.getEquipmentSet().add(bradEquipment);


        Sportsman sportsman2 = new Sportsman();
        sportsman2.setFirstName("Tim");
        sportsman2.setLastName("Jones");
        sportsman2.setAddress("Rogers st.");
        sportsman2.setCity("Colorado");
        sportsman2.setTelephone("888-88-88");
        sportsmanService.save(sportsman2);

        Equipment timEquipment = new Equipment();
        timEquipment.setEquipmentType(equipmentType2);
        timEquipment.setSportsman(sportsman2);
        timEquipment.setShoppingDate(LocalDate.now());
        timEquipment.setName(equipmentType2.getName());
        sportsman2.getEquipmentSet().add(timEquipment);


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
