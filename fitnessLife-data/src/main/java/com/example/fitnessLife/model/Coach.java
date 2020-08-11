package com.example.fitnessLife.model;

import java.util.HashSet;
import java.util.Set;

public class Coach extends Person {

    private Set<Sport> typesOfSport = new HashSet<>();

    public Set<Sport> getTypesOfSport() {
        return typesOfSport;
    }

    public void setTypesOfSport(Set<Sport> typesOfSport) {
        this.typesOfSport = typesOfSport;
    }
}
