package com.solvd.entities;

import com.solvd.enums.HorseBreedEnum;
import com.solvd.interfaces.IMakeSound;
import com.solvd.interfaces.IRun;
import com.solvd.interfaces.ISleep;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
public final class Horse extends Animal implements ISleep, IRun, IMakeSound {
    private final HorseBreedEnum breed;
    public boolean isRaceHorse;


    public Horse(String name, double weight, HorseBreedEnum breed, String color, boolean isRaceHorse, int age, int speed) {
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.isRaceHorse=isRaceHorse;

        if(weight>0 && weight<1000) {
            this.weight=weight;

        }else {
            System.out.println("Invalid weight, enter weight in range (0, 1000]");
            this.weight=1;
        }

        if(age<0) {
            System.out.println("Age should be positive value.");
            this.age=1;
        }else {
            this.age=age;
        }


    }

    @Override
    public void sleepDuration() {
        System.out.println("Horse " + this.name + " is sleeping " + SLEEP_DURATION + "hours");

    }

    @Override
    public void runningSpeed() {
        System.out.println("Horse " + this.name + " is running with speed " + breed.getSpeed() );
    }

    @Override
    public void eat() {
        System.out.println("Horse " + this.name + " is eating");
    }

    @Override
    public String toString() {
        return String.format("Horse{breed=%s, speed=%d, isRaceHorse=%b}",
                breed.name(), breed.getSpeed(), isRaceHorse);
    }



}
