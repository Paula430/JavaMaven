package com.solvd.entities;

import com.solvd.interfaces.IMakeSound;
import com.solvd.interfaces.IRun;
import com.solvd.interfaces.ISleep;

import java.util.Objects;

public final class Dog extends Animal implements IRun, ISleep, IMakeSound {
    private final DogBreed breed;
    public boolean isTrained=false;
    public int speed;

    public Dog(String name, double weight, DogBreed breed, String color, boolean isTrained, int age, int speed) {
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

    public Dog(DogBreed breed) {
        this.breed = breed;
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
    public String toString() {
        return "entities.Dog [breed=" + breed + ", isTrained=" + isTrained + ", name=" + name + ", weight=" + weight + ", color="
                + color + ", age=" + age + "]";
    }

    @Override
    public void sleepDuration() {
        System.out.println("Dog " + this.name + " is sleeping " + SLEEP_DURATION + "hours");

    }

    @Override
    public void makeSound() {
        System.out.println("Dog "+ this.name + " is barking");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(breed, isTrained);
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
        Dog other = (Dog) obj;
        return Objects.equals(breed, other.breed) && isTrained == other.isTrained;
    }

    public DogBreed getBreed() {
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
