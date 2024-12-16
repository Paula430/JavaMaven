package com.solvd;

import com.solvd.entities.Cat;
import com.solvd.entities.Fish;
import com.solvd.entities.Horse;
import com.solvd.enums.CatBreedEnum;
import com.solvd.enums.HorseBreedEnum;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamReflection {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //Stream:
        Horse horse1=new Horse("Willow", 280, HorseBreedEnum.MUSTANG,"black", true, 5);
        Horse horse2=new Horse("Willow", 280,HorseBreedEnum.SHIRE,"black", true, 8);
        Horse horse3=new Horse("Luke", 300, HorseBreedEnum.ARABIAN,"white", true, 2);
        List<Horse> horseList= new ArrayList<>();
        horseList.add(horse1);
        horseList.add(horse2);
        horseList.add(horse3);

        System.out.println("All horses in collection: ");
        horseList.forEach(h-> System.out.println(h));

        System.out.println("Filtering horses with weight >290: ");
        horseList.stream().filter(h->h.getWeight()>=290).forEach(h-> System.out.println(h));

        System.out.println("Map Horses to BreedEnum:");
        horseList.stream().map(h->h.getBreed()).toList().forEach(h-> System.out.println(h));

        System.out.println("Check if all horses are trained: ");
        System.out.println(horseList.stream().allMatch(h->h.isRaceHorse));

        System.out.println("Sorting horses by age: ");
        horseList.stream().sorted((h1,h2)->h1.getAge()- h2.getAge()).forEach(h-> System.out.println(h));

        System.out.println("Summarize horse's age");
        System.out.println(horseList.stream().map(h->h.getAge()).reduce(0,(x,y)->x+y));

        System.out.println("Horse with the highest speed");
        System.out.println(horseList.stream().max((h1,h2)->h1.getBreed().getSpeed()-h2.getBreed().getSpeed()).get());

        System.out.println("Increase horse's age: ");
        horseList.stream().forEach(h->h.age++);
        horseList.stream().forEach(h-> System.out.println(h));

        //Reflection:
        Class<?> catClass=Class.forName("com.solvd.entities.Cat");
        Constructor<?>[] constructorsCat=catClass.getConstructors();
        Arrays.stream(constructorsCat).forEach(System.out::println);
        Cat cat= (Cat) constructorsCat[1].newInstance("Catty",5.8, CatBreedEnum.MAINE_COON,"black",6,8);

        Method[] methodsCat= catClass.getMethods();
        Arrays.stream(methodsCat).forEach(m-> {
            System.out.println(m.getName());
            Arrays.stream(m.getParameterTypes()).forEach(p-> System.out.println(p));
        });

        Arrays.stream(methodsCat).filter(m->m.getName().equals("getColor")).findFirst().ifPresent(m-> {
            try {
                Object result=m.invoke(cat);
                System.out.println("Print cat's color from reflection:");
                System.out.println(result);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        });

        //change private field:
        Class<?> classFish= Class.forName("com.solvd.entities.Fish");
        Fish fish=new Fish("Tom",0.2,8,1,"Siamese");
        Field field= fish.getClass().getDeclaredField("length");
        field.setAccessible(true);
        field.set(fish,9);
        System.out.println(fish.getLength());
    }
}
