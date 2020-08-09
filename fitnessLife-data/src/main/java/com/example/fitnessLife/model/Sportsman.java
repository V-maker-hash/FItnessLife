package com.example.fitnessLife.model;

import java.util.Set;

public class Sportsman extends Person {

    private Set<Equipment> equipmentSet;

    public Set<Equipment> getEquipmentSet() {
        return equipmentSet;
    }

    public void setEquipmentSet(Set<Equipment> equipmentSet) {
        this.equipmentSet = equipmentSet;
    }
}
