package ru.homework.java.core;

import java.util.*;

public class Lesson4Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        ArrayDuplicates();
        PhoneBook phoneBook1 = new PhoneBook();
        phoneBook1.add("Smirnov", "89057605261");
        phoneBook1.add("Morozov", "89750967902");
        phoneBook1.add("Volkov", "89670956709");
        phoneBook1.add("Smirnov", "89690836239");
        phoneBook1.add("Smirnov", "89346309866");
        phoneBook1.add("Volkov", "89459835934");
        System.out.println();
        System.out.println("Task 2:");
        phoneBook1.get("Smirnov");
        phoneBook1.get("Volkov");
        phoneBook1.get("Morozov");
    }

    public static void ArrayDuplicates() {
        String[] names = {"James", "Watson", "Emilia", "Emilia", "Andrew", "James", "Rem", "Andrew", "Justin", "Gregory", "James", "Brannon", "James", "Julius", "Julius"};
        Set<String> uniqueNames = new HashSet<>();
        ArrayList<String> countNames = new ArrayList<>(Arrays.asList(names));
        for (int i = 0; i < names.length; i++) {
            int count = Collections.frequency(countNames, names[i]);
            uniqueNames.add("Слово '" + names[i] + "' - " + count);
        }
        // Мне хотелось бы отсотрировать лист по количеству дубликатов каждого слова, но не удалось
        System.out.println(uniqueNames);
    }
}
