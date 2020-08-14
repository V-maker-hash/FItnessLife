package com.example.fitnessLife.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "equipment_type")
public class EquipmentType extends BaseEntity{

    @Column(name = "name")
    private String name;


}
