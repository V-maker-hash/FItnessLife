package com.example.fitnessLife.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EquipmentController {

    @RequestMapping({"/equipment", "/equipment/index", "/equipment/index.html"})
    String listEquipments(){
        return "equipment/index";
    }
}
