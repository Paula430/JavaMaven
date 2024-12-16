package com.solvd.entities;

import com.solvd.interfaces.ISwim;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public final class Fish extends Animal implements ISwim {
    private double length;
    public final String species;

    public Fish(String name, double weight, double length, int age, String species) {
        this.species = species;
        this.name=name;

        if(weight>0 && weight<450) {
            this.weight=weight;
        }else {
            System.out.println("Invalid weight, enter weight in range (0, 500]");
            this.weight=1;
        }

        if(length<0) {
            System.out.println("Length should be positive value");
        }else {
            this.length=length;
        }

        if(age<0) {
            System.out.println("Age should be positive value.");
            this.age=1;
        }else {
            this.age=age;
        }
    }

    public Fish(String species) {
        this.species = species;
    }

    @Override
    public void swim() {
        System.out.println("Fish " + this.name + " is swimming");
    }

    @Override
    public void eat() {
        System.out.println("Fish " + this.name + " is eating");
    }





}

