package ru.geekbrains;

public class Cat extends Animals {
    public static int number = 0;

    public Cat(Integer run, Integer swim, String name) {
        super(run, 0, name);
        number++;
    }
}
