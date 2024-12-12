package com.solvd.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public abstract class Animal {

    protected String name;
    protected double weight;
    protected String color;
    public int age;
    public static int numberOfAnimal;

    static{
        numberOfAnimal=0;
        System.out.println("Animal class loaded. Initializing number of animal: " + numberOfAnimal);
    }
    public Animal() {
        numberOfAnimal++;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public static int getNumberOfAnimal(){
        return numberOfAnimal;
    }

    public final void breathe(){
        System.out.println("Animal is breathing");
    }



}

