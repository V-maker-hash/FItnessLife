package com.example.fitnessLife.controllers;

import com.example.fitnessLife.services.SportsmanService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sportsman")
public class SportsmanController {

    SportsmanService sportsmanService;

    public SportsmanController(SportsmanService sportsmanService) {
        this.sportsmanService = sportsmanService;
    }

    @RequestMapping({"/index", "/index.html"})
    String listSportsmen(Model model) {
        model.addAttribute("sportsman", sportsmanService.findAll());
        return "sportsman/index";
    }
}
