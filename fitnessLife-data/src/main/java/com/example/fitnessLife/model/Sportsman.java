package com.example.fitnessLife.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "sportsman")
public class Sportsman extends Person {

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sportsman")
    private Set<Equipment> equipmentSet = new HashSet<>();

    @Builder
    public Sportsman(Long id, String firstName, String lastName, String address,
                     String city, String telephone, Set<Equipment> equipmentSet) {
        super(id, firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.equipmentSet = equipmentSet;
    }

}
