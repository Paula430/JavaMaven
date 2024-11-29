package com.solvd.entities;

import java.util.Objects;

public class HorseBreed extends Breed {
    private double speed;

    public HorseBreed(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public HorseBreed() {

    }

    @Override
    public String toString() {
        return "entities.HorseBreed [speed=" + speed + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(speed);
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
        HorseBreed other = (HorseBreed) obj;
        return Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
