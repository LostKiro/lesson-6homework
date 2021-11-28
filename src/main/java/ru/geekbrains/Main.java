package ru.geekbrains;



public class Main {
    public static void main(String[] args) {
        Animals[] animals = {
                new Cat(200, 0, "Vasy"),
                new Cat(200, 0, "Smoki"),
                new Cat(200, 0, "Zepo"),
                new Cat(200, 0, "Pups"),
                new Cat(200, 0, "Tom"),
                new Dog(500, 10 , "Doggi"),
                new Dog(500, 10 , "Luk"),
                new Dog(500, 10, "Backs"),
                new Dog(500, 10, "Euro"),
                new Dog(500, 10, "Rubl")
        };
        for (Animals o: animals) {
            o.run(200);
            o.swim(10);
        }
        System.out.println("Animals numb" + Animals.number);
        System.out.println("Cats numb" + Cat.number);
        System.out.println("Dogs numb" + Dog.number);
    }
}
