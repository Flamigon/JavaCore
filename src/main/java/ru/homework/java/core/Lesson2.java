package ru.homework.java.core;

public class Lesson2 {
    public static void main(String[] args) {
        String arr[][]= {{"1","1","1", "1"},{"1","1","1", "1"},{"1","1","1","1"}, {"1","1","1", "1"}};
        ArraySum(arr);
    }

    public static void ArraySum(String[][] array) {
        try{
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                if (array.length != 4 || array[i].length != 4) {
                    throw new MyArraySizeException("MASE");
                }
                for (int j = 0; j < 4; j++) {
                    int a;
                    try {
                        a = Integer.parseInt(array[i][j]);
                        sum += a;
                    } catch (NumberFormatException e) {
                        try {
                            throw new MyArrayDataException("MADE");
                        } catch (MyArrayDataException ex) {
                            System.out.println("Введите целое число, координаты поля для исправления: " + (i+1) + " массив" + " " + (j+1) + " поле");
                            System.exit(0);
                        }
                    }
                }
            }
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Input a 4x4 array");
        }
    }
}
