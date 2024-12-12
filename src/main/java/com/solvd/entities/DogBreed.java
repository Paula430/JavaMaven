package com.solvd.entities;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class DogBreed extends Breed {
    private String size;

    public DogBreed(String name, String size) {
        this.name=name;
        this.size=size;
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

}

