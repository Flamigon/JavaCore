package ru.homework.java.core;

public interface Race {
    boolean run(String name, int lengthLimit, int distance);
    boolean jump(String name, double heightLimit, double height);
}