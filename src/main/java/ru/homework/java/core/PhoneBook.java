package ru.homework.java.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String familyName, String phoneNumber){
        ArrayList<String> list;
        if(phoneBook.containsKey(familyName)){
            list = phoneBook.get(familyName);
            list.add(phoneNumber);
        } else {
            phoneBook.put(familyName, new ArrayList<>());
            phoneBook.get(familyName).add(phoneNumber);
        }
    }

    public void get(String familyName) {
        ArrayList<String> numbers = phoneBook.get(familyName);
        System.out.println(numbers);
    }
}
