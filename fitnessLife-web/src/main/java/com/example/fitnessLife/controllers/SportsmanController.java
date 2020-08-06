package com.example.fitnessLife.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sportsman")
public class SportsmanController {

    @RequestMapping({"/index", "/index.html"})
    String listSportsmen() {
        return "sportsman/index";
    }
}
