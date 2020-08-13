package com.example.fitnessLife.bootstrap;

import com.example.fitnessLife.model.*;
import com.example.fitnessLife.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final SportsmanService sportsmanService;
    private final CoachService coachService;
    private final EquipmentTypeService equipmentTypeService;
    private final SportService sportService;
    private final VisitService visitService;

    public DataLoader(SportsmanService sportsmanService, CoachService coachService,
                      EquipmentTypeService equipmentTypeService, SportService sportService, VisitService visitService) {

        this.sportsmanService = sportsmanService;
        this.coachService = coachService;
        this.equipmentTypeService = equipmentTypeService;
        this.sportService = sportService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = equipmentTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        Sport swimming = new Sport();
        swimming.setDescription("Swimming");
        Sport savedSwimming = sportService.save(swimming);

        Sport bodybuilding = new Sport();
        bodybuilding.setDescription("Bodybuilding");
        Sport savedBodybuilding = sportService.save(bodybuilding);

        Sport boxing = new Sport();
        boxing.setDescription("Boxing");
        Sport savedBoxing = sportService.save(bodybuilding);


        EquipmentType equipmentType = new EquipmentType();
        equipmentType.setName("Gym Equipment");
        EquipmentType gymEquipment = equipmentTypeService.save(equipmentType);

        EquipmentType equipmentType2 = new EquipmentType();
        equipmentType.setName("Swimming Equipment");
        EquipmentType swimmingEquipment = equipmentTypeService.save(equipmentType2);




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

        Visit visit = new Visit();
        visit.setDate(LocalDate.now());
        visit.setDescription("Visit with Gym Equipment");
        visit.setEquipment(bradEquipment);

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

        Visit visit2 = new Visit();
        visit2.setDate(LocalDate.now());
        visit2.setDescription("Visit with Swimming Equipment");
        visit2.setEquipment(timEquipment);
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
