package com.example.fitnessLife.controllers;

import com.example.fitnessLife.services.CoachService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/coach")
public class CoachController {
    CoachService coachService;

    public CoachController(CoachService coachService) {
        this.coachService = coachService;
    }

    @RequestMapping({"/index", "/index.html"})
    public String listCoaches(Model model){
        model.addAttribute("coaches", coachService.findAll());

        return "coach/index.html";
    }
}
