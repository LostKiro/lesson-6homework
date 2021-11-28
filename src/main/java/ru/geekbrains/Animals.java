package ru.geekbrains;

public class Animals {

    private final Integer run;
    private final Integer swim;
    private final String name;
    public static int number = 0;

    public Animals(Integer run, Integer swim, String name) {

        this.run = run;
        this.swim = swim;
        this.name = name;
        number++;

    }
    public void run(Integer maxRun) {
        if (maxRun > run) {
            System.out.println(name + "не может пробежать эту дистанцию" + " " + maxRun);
        } else if (maxRun < 0) {
            System.out.println("дистанция не может быть отрицательной");
        } else {
            System.out.println(name + " " + "пробежал " + maxRun + "м ");
        }
    }
    public void swim(Integer maxSwim) {
        if (maxSwim > run) {
            System.out.println(name + "не может проплыть эту дистанцию" + " " + maxSwim);
        } else if (maxSwim < 0) {
            System.out.println("дистанция не может быть отрицательной");
        } else {
            System.out.println(name + " " + "проплыл " + maxSwim + "м ");
        }
    }
}
