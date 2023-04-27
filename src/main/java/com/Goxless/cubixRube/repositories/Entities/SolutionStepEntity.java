package com.Goxless.cubixRube.repositories.Entities;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

@Entity
@Getter@Setter
@Component
@Table(name="solution")
public class SolutionStepEntity {
    public SolutionStepEntity() {
    }

    public SolutionStepEntity(String hashedArrayConfig, String movement) {
        this.hashedArrayConfig = hashedArrayConfig;
        this.movement = movement;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="config", unique = true)
    private String hashedArrayConfig;

    @Column
    private String movement;


}
