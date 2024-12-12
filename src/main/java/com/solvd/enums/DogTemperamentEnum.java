package com.solvd.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DogTemperamentEnum {
    FRIENDLY("Social and approachable", 8),
    AGGRESSIVE("Defensive and territorial", 2),
    CALM("Relaxed and laid-back", 6),
    ENERGETIC("Active and playful", 10),
    LOYAL("Faithful and dependable", 9),
    INDEPENDENT("Self-reliant and aloof", 5);

    private final String behaviorDescription;
    private final int energyLevel;

    public String getDetails() {
        return String.format("%s: %s (Energy Level: %d)", name(), behaviorDescription, energyLevel);
    }

}
