package com.solvd.entities;

import java.util.Objects;

public class DogBreed extends Breed {
    private String size;

    public DogBreed(String name, String size) {
        this.name=name;
        this.size=size;
    }

    public DogBreed() {

    }

    @Override
    public String toString() {
        return "entities.DogBreed [size=" + size + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(size);
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
        DogBreed other = (DogBreed) obj;
        return Objects.equals(size, other.size);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        String[] sizeArray= {"small", "medium", "big"};
        boolean isValidSize=false;

        for(int i=0; i<sizeArray.length; i++) {
            if(sizeArray[i].equalsIgnoreCase(size)) {
                isValidSize=true;
                break;
            }

        }

        if(isValidSize) {
            this.size=size;
        }else {
            System.out.println("Invalid size. Please choose 'small', 'medium', or 'big'.");
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



}

