package com.example.fitnessLife.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "coach")
public class Coach extends Person {

    @ManyToMany
    @JoinTable(name = "coach_sport", joinColumns = @JoinColumn(name = "coach_id"),
            inverseJoinColumns = @JoinColumn(name = "sport_id"))
    private Set<Sport> typesOfSport = new HashSet<>();

    public Set<Sport> getTypesOfSport() {
        return typesOfSport;
    }

    public void setTypesOfSport(Set<Sport> typesOfSport) {
        this.typesOfSport = typesOfSport;
    }
}
