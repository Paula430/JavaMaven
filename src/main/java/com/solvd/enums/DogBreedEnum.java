package com.solvd.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DogBreedEnum {
    GERMAN_SHEPHERD("Loyal and intelligent", SizeDogEnum.LARGE, DogTemperamentEnum.LOYAL),
    LABRADOR("Friendly and active", SizeDogEnum.LARGE, DogTemperamentEnum.FRIENDLY),
    GOLDEN_RETRIEVER("Gentle and affectionate", SizeDogEnum.LARGE, DogTemperamentEnum.FRIENDLY),
    BEAGLE("Curious and merry", SizeDogEnum.MEDIUM, DogTemperamentEnum.ENERGETIC),
    CHIHUAHUA("Small and alert", SizeDogEnum.SMALL, DogTemperamentEnum.INDEPENDENT),
    PUG("Charming and playful", SizeDogEnum.SMALL, DogTemperamentEnum.CALM);

    private final String description;
    private final SizeDogEnum size;
    private final DogTemperamentEnum temperament;

    public String getDetails() {
        return String.format("%s: %s, Size: %s, Temperament: %s (%s)",
                name(), description, size, temperament.name(), temperament.getBehaviorDescription());
    }

}
