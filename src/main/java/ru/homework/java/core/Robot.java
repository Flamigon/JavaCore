package ru.homework.java.core;

public class Robot implements Race {
    String name;
    int lengthLimit;
    double heightLimit;

    public Robot(String name, int lengthLimit, double heightLimit) {
        this.name = name;
        this.lengthLimit = lengthLimit;
        this.heightLimit = heightLimit;
    }

    public boolean run(String name, int lengthLimit, int distance) {
        if (lengthLimit >= distance && distance >= 0) {
            System.out.println(name + " successfully ran " + distance + " meters");
            return true;
        } else {
            System.out.println(name + " failed to run " + distance + " meters");
            return false;
        }
    }

    public boolean jump(String name, double heightLimit, double height) {
        if (heightLimit>= height && height >= 0) {
            System.out.println(name + " successfully jumped " + height + " meters");
            return true;
        } else {
            System.out.println(name + " failed to jump " + height + " meters");
            return false;
        }
    }
}
