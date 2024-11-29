package com.solvd;

import com.solvd.entities.*;
import com.solvd.exceptions.*;
import com.solvd.interfaces.*;
import com.solvd.generics.*;

import java.util.*;

public class App {

    public static void main(String[] args) throws AgeLessThanZeroException {
        CatBreed breedBritish = new CatBreed("British", "lazy");
        Cat cat1 = new Cat("Sabrina", 5, breedBritish, "grey", 3, 15);
        DogBreed breedBulldog = new DogBreed("Bulldog", "medium");
        Dog dog1 = new Dog("Charlie", 10.3, breedBulldog, "brown", true, 1, 20);
        HorseBreed breedMustang=new HorseBreed("Mustang",65);
        HorseBreed breedArabic=new HorseBreed("Arabic",48);
        Horse horse1=new Horse("Willow", 280,breedMustang,"black", true, 5, 60);
        Horse horse2=new Horse("Willow", 280,breedMustang,"black", true, 5, 65);

        /* 1. HashMap*/
        System.out.println("Hashmap: ");
        Map <String,Animal> animalsHashMap=new HashMap<>();
        animalsHashMap.putIfAbsent("cat",cat1);
        animalsHashMap.putIfAbsent("dog",dog1);
        animalsHashMap.putIfAbsent("horse",horse1);
        animalsHashMap.putIfAbsent("horse2",horse2);

        for(Map.Entry<String,Animal> entry : animalsHashMap.entrySet()){
            System.out.println("Key: "+ entry.getKey() + "Value: "+ entry.getValue());
        }
        System.out.println(animalsHashMap.containsKey("parrot"));
        System.out.println(animalsHashMap.get("horse"));

        /* 2. HashSet */
        System.out.println("HashSet: ");
        Set<String> stringSet= new HashSet<>();
        stringSet.add("Volvo");
        stringSet.add("BMW");
        stringSet.add("Ford");
        stringSet.add("Mazda");
        stringSet.add("Audi");
        System.out.println(stringSet.contains("Ford1"));
        System.out.println(stringSet.size());
        stringSet.remove("Volvo");
        System.out.println(stringSet.size());
        stringSet.forEach(System.out::println);

        /* 3. PriorityQueue for priority order */
        System.out.println("PriorityQueue: ");
        Queue<Horse> horseQueue =new PriorityQueue<>((a1,a2)->a1.speed - a2.speed);
        horseQueue.add(horse1);
        horseQueue.add(horse2);
        while(!horseQueue.isEmpty()){
            Horse horse= horseQueue.poll(); // returns and removes the element at the front end
            System.out.println(horse.speed);
        }

        /* 4. ArrayList */
        System.out.println("ArrayList: ");
        List<Animal> animalsArray = new ArrayList<>();
        animalsArray.add(dog1);
        animalsArray.add(horse1);
        animalsArray.addFirst(cat1);
        System.out.println(animalsArray);
        System.out.println(animalsArray.get(1));

        /* 5. Deque */
        System.out.println("Deque: ");
        Deque<Animal> animalDeque = new ArrayDeque<>();
        animalDeque.addFirst(dog1);
        animalDeque.addLast(cat1);
        animalDeque.addFirst(horse1);

        while (!animalDeque.isEmpty()) {
            Animal animal = animalDeque.removeFirst();
            System.out.println(animal);
        }

        /* 6. generic class with linked list*/
        System.out.println("Generic LinkedList: ");
        AnimalShelter<Horse> horseShelter=new AnimalShelter<>();
        horseShelter.addAnimal(horse1);
        horseShelter.addAnimal(horse2);
        horseShelter.makeAllAnimalsEat();
    }


}
