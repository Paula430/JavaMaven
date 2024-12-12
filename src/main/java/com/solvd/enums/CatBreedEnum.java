package com.solvd.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CatBreedEnum {
    SIAMESE("Intelligent and sociable"),
    PERSIAN("Calm and affectionate"),
    MAINE_COON("Large and friendly"),
    SPHYNX("Energetic and playful"),
    BENGAL("Agile and athletic");

    private final String description;

    public String getDetails() {
        return String.format("%s: %s", name(), description);
    }
}
