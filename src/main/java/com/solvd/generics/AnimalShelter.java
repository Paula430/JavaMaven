package com.solvd.generics;

import com.solvd.entities.Animal;
import java.util.*;

public class AnimalShelter<T extends Animal> {
    private List<T> animals = new LinkedList<>();

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public void makeAllAnimalsEat() {
        for (T animal : animals) {
            animal.eat();
        }
    }

}
