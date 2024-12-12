package com.solvd.entities;

import com.solvd.interfaces.IFly;
import com.solvd.interfaces.IMakeSound;
import com.solvd.interfaces.ISleep;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public final class Bird extends Animal implements IFly, ISleep, IMakeSound {
    public boolean migration;

    public Bird(String name, double weight, int age, String color, boolean migration) {
        this.name=name;
        this.weight=weight;
        this.age=age;
        this.color=color;
        this.migration=migration;
    }

    @Override
    public void sleepDuration() {
        System.out.println("Bird " + this.name + " is sleeping " + SLEEP_DURATION + "hours");

    }

    @Override
    public void makeSound() {
        System.out.println("The bird " + this.name + " is singing");
    }

    @Override
    public void eat() {
        System.out.println("Bird " + this.name + " is eating");
    }

    @Override
    public void fly() {
        System.out.println("Bird " + this.name + " is flying");
    }

    @Override
    public void sleep() {
        System.out.println("Bird " + this.name + " is sleeping");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return migration == bird.migration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), migration);
    }
}
