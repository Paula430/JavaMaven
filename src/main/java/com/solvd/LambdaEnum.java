package com.solvd;

import com.solvd.entities.Dog;
import com.solvd.entities.DogBreed;
import com.solvd.entities.Horse;
import com.solvd.entities.HorseBreed;
import com.solvd.enums.CatBreedEnum;
import com.solvd.enums.DogBreedEnum;
import com.solvd.enums.HorseBreedEnum;
import com.solvd.lambda.IAgeIncrementer;
import com.solvd.lambda.IAgeIncrementer;
import com.solvd.lambda.ICheck;
import com.solvd.lambda.ICompare;

import java.util.*;

public class LambdaEnum {
    public static void main(String[] args) {

        Horse horse1=new Horse("Willow", 280, HorseBreedEnum.MUSTANG,"black", true, 5);
        Horse horse2=new Horse("Willow", 280,HorseBreedEnum.SHIRE,"black", true, 5);
        Horse horse3=new Horse("Luke", 300, HorseBreedEnum.ARABIAN,"white", true, 2);

        Dog dog1 = new Dog("Charlie", 10.3, DogBreedEnum.CHIHUAHUA, "brown", true, 3, 21);
        Dog dog2 = new Dog("Abby", 9, DogBreedEnum.BEAGLE, "black", true, 1, 18);
        Dog dog3 = new Dog("Hortex", 12, DogBreedEnum.LABRADOR, "white", false, 2, 15);

        //Lambda:
        List<Horse> horseList= new ArrayList<>();
        horseList.add(horse2);
        horseList.add(horse1);
        horseList.add(horse3);

        ICompare<Horse> compareHorseSpeed= (h1,h2) -> h1.getBreed().getSpeed() - h2.getBreed().getSpeed();

        horseList.sort((h1,h2)-> compareHorseSpeed.compare(h1,h2));
        System.out.println("Sorted horse by speed:");
        horseList.forEach(System.out::println);

        IAgeIncrementer<Horse> addAgeHorse= h->h.age++;

        horseList.forEach(horse->addAgeHorse.addAge(horse));
        System.out.println("Increase horse's age");
        horseList.forEach(horse-> System.out.println(horse.age));


        List<Dog> dogsList= new ArrayList<>();
        dogsList.add(dog1);
        dogsList.add(dog2);
        dogsList.add(dog3);

        ICheck<Dog> checkDogIsTrained=dog-> dog.isTrained();

        List<Dog> trainedDogs= new ArrayList<>();
        for(Dog dog : dogsList){
            if(checkDogIsTrained.check(dog)){
                trainedDogs.add(dog);
            }
        }

        System.out.println("Trained dogs:");
        trainedDogs.forEach(trainedDog-> System.out.println(trainedDog));

        //Enums
        System.out.println("Horse breed details: ");
        for (HorseBreedEnum breed : HorseBreedEnum.values()) {
            System.out.println(breed.getDetails());
        }

        System.out.println("Dog breed details: ");
        for (DogBreedEnum breed : DogBreedEnum.values()) {
            System.out.println(breed.getDetails());
        }

        System.out.println("Cag breed details: ");
        for (CatBreedEnum breed : CatBreedEnum.values()) {
            System.out.println(breed.getDetails());
        }



    }

}
