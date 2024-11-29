package com.solvd.interfaces;

public interface IMakeSound {
   default void makeSound(){
       System.out.println("Animal is making sound");
   };
}
