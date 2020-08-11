package com.example.fitnessLife.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "equipment")
public class Equipment extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "equipment_type_id")
    private EquipmentType equipmentType;

    @ManyToOne
    @JoinColumn(name = "sportsman_id")
    private Sportsman sportsman;

    @Column(name = "shopping_date")
    private LocalDate shoppingDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
    }

    public Sportsman getSportsman() {
        return sportsman;
    }

    public void setSportsman(Sportsman sportsman) {
        this.sportsman = sportsman;
    }

    public LocalDate getShoppingDate() {
        return shoppingDate;
    }

    public void setShoppingDate(LocalDate shoppingDate) {
        this.shoppingDate = shoppingDate;
    }
}
