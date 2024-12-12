package com.solvd.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum SizeDogEnum {
    SMALL("Small size, ideal for apartments"),
    MEDIUM("Medium size, versatile for most households"),
    LARGE("Large size, needs more space");

    private final String description;


}
