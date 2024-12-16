package com.solvd.entities;

import com.solvd.enums.CatBreedEnum;
import com.solvd.interfaces.IMakeSound;
import com.solvd.interfaces.IRun;
import com.solvd.interfaces.ISleep;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor(force = true)
public final class Cat extends Animal implements IRun, ISleep, IMakeSound {
    private final CatBreedEnum breed;
    public int speed;

    public Cat(String name, double weight, CatBreedEnum breed, String color, int age, int speed) {
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.speed=speed;

        if(weight>0 && weight<100) {
            this.weight=weight;
        }else {
            System.out.println("Invalid weight, enter weight in range (0, 100]");
            this.weight=1;
        }

        if(age<0) {
            System.out.println("Age should be positive value.");
            this.age=1;
        }else {
            this.age=age;
        }

        if(speed<0) {
            System.out.println("Age should be positive value.");
            this.speed=1;
        }else {
            this.speed=speed;
        }
    }


    @Override
    public void runningSpeed() {
        System.out.println("Cat " + this.name + " is running with speed " + this.speed);
    }

    @Override
    public void makeSound() {
        System.out.println("The cat " + this.name + " meows");
    }

    @Override
    public void run() {
        System.out.println("Cat " + this.name + " is running");
    }

    @Override
    public void sleepDuration() {
        System.out.println("Dog " + this.name + " is sleeping " + SLEEP_DURATION + "hours");

    }
    @Override
    public void eat() {
        System.out.println("Cat " + this.name + " is eating");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed=" + breed +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
