package com.solvd.entities;

import com.solvd.interfaces.ISwim;

import java.util.Objects;

public final class Fish extends Animal implements ISwim {
    private double length;
    public final String species;

    public Fish(String name, double weight, double length, int age, String species, String species1) {
        this.species = species1;
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
    public String toString() {
        return "Fish{" +
                "length=" + length +
                ", species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Fish " + this.name + " is eating");
    }


    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fish fish = (Fish) o;
        return Double.compare(length, fish.length) == 0 && Objects.equals(species, fish.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, species);
    }
}

