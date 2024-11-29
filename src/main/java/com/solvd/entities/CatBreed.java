package com.solvd.entities;

import java.util.Objects;

public class CatBreed extends Breed {
    private String characteristic;

    public CatBreed(String name, String characteristic) {
        this.name=name;
        this.characteristic=characteristic;
    }

    public CatBreed() {

    }

    @Override
    public String toString() {
        return "entities.CatBreed [characteristic=" + characteristic + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(characteristic);
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
        CatBreed other = (CatBreed) obj;
        return Objects.equals(characteristic, other.characteristic);
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}

