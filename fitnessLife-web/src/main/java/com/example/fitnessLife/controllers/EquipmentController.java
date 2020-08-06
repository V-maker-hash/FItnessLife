package com.example.fitnessLife.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/equipment")
public class EquipmentController {

    @RequestMapping({"/index", "/index.html"})
    String listEquipments(){
        return "equipment/index";
    }
}
