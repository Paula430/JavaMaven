package com.solvd.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HorseBreedEnum{
    ARABIAN(55,"Known for speed and endurance"),
    THOROUGHBRED(60,"Famous for racing"),
    QUARTER_HORSE(70,"Excellent for sprinting short distances"),
    SHIRE(30,"A strong draft horse"),
    MUSTANG(50,"A wild and free horse breed"),
    APPALOOSA(40,"Known for its colorful spotted coat");

    private final int speed;
    private final String description;

    public String getDetails(){
        return String.format("%s: %s, Speed: %d km/h", name(), description, speed);
    }


}
