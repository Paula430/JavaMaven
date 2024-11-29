package com.solvd.entities;

import com.solvd.interfaces.IMakeSound;
import com.solvd.interfaces.IRun;
import com.solvd.interfaces.ISleep;

import java.util.Objects;

public final class Horse extends Animal implements ISleep, IRun, IMakeSound {
    private final HorseBreed breed;
    public boolean isRaceHorse;
    public int speed;


    public Horse(String name, double weight, HorseBreed breed, String color, boolean isRaceHorse, int age, int speed) {
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.isRaceHorse=isRaceHorse;
        this.speed=speed;

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

        if(speed<0) {
            System.out.println("Age should be positive value.");
            this.speed=1;
        }else {
            this.speed=speed;
        }

    }

    public Horse(HorseBreed breed) {
        this.breed = breed;
    }

    @Override
    public void sleepDuration() {
        System.out.println("Horse " + this.name + " is sleeping " + SLEEP_DURATION + "hours");

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(breed, isRaceHorse);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Horse other = (Horse) obj;
        return Objects.equals(breed, other.breed) && isRaceHorse == other.isRaceHorse;
    }

    @Override
    public String toString() {
        return "entities.Horse [breed=" + breed + ", isRaceHorse=" + isRaceHorse + ", name=" + name + ", weight=" + weight
                + ", color=" + color + ", age=" + age + "]";
    }


    @Override
    public void runningSpeed() {
        System.out.println("Horse " + this.name + " is running with speed " + this.speed);
    }

    @Override
    public void eat() {
        System.out.println("Horse " + this.name + " is eating");
    }

    public HorseBreed getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight=weight;
    }



}
