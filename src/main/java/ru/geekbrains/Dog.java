package ru.geekbrains;

public class Dog extends Animals{
    public static int number = 0;

    public Dog(Integer run, Integer swim, String name) {
        super(run, swim, name);
        number++;
    }
}
