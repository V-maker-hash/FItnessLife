package com.example.fitnessLife.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "equipment")
    private Set<Visit> visitSet = new HashSet<>();

}
