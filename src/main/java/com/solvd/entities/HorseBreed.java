package com.solvd.entities;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class HorseBreed extends Breed {
    private double speed;

    public HorseBreed(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }


}
