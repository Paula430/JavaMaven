package com.solvd.entities;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class CatBreed extends Breed {
    private String characteristic;

    public CatBreed(String name, String characteristic) {
        this.name=name;
        this.characteristic=characteristic;
    }



}

