package com.solvd.entities;

import com.solvd.enums.DogBreedEnum;
import com.solvd.interfaces.IMakeSound;
import com.solvd.interfaces.IRun;
import com.solvd.interfaces.ISleep;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public final class Dog extends Animal implements IRun, ISleep, IMakeSound {
    private final DogBreedEnum breed;
    public boolean isTrained=false;
    public int speed;

    public Dog(String name, double weight, DogBreedEnum breed, String color, boolean isTrained, int age, int speed) {
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.isTrained=isTrained;
        this.speed=speed;

        if(weight>0 && weight<100) {
            this.weight=weight;
        }else {
            System.out.println("Invalid weight, enter weight in range (0 100]");
            this.weight=1;
        }

        if(age<0) {
            System.out.println("Age should be positive value.");
            this.age=1;
        }else {
            this.age=age;
        }

        if(speed<0) {
            System.out.println("Age should be positive value.");
            this.speed=1;
        }else {
            this.speed=speed;
        }
    }

    @Override
    public void runningSpeed() {
        System.out.println("Dog " + this.name + " is running with speed " + this.speed);
    }

    @Override
    public void eat() {
        System.out.println("Dog " + this.name + " is eating");
    }

    @Override
    public void sleepDuration() {
        System.out.println("Dog " + this.name + " is sleeping " + SLEEP_DURATION + "hours");

    }

    @Override
    public void makeSound() {
        System.out.println("Dog "+ this.name + " is barking");
    }




}
