package ru.homework.java.core;

import java.io.*;

public class Lesson5Main {
    public static void main(String[] args) {
        AppData data1 = new AppData(new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}, new int[][] {{1, 2, 3, 4}, {4, 5, 6}, {7, 8, 9, 10}});
        System.out.println("Saving:");
        data1.save("ourfile.csv");
        System.out.println();
        System.out.println("Reader:");
        reader("ourfile.csv");
        System.out.println();
        System.out.println("Second Writing:");
        writer(data1.getHeader(), data1.getData(), "ourfile.csv");

    }

    public static void reader(String filePath){
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writer(String[] titles, int[][] content, String filePath){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            for (int i = 0; i <titles.length; i++) {
                writer.write(titles[i]+";");
            }
            writer.newLine();
            for (int i = 0; i < content.length; i++) {
                for (int j = 0; j < content[i].length; j++) {
                    writer.write(content[i][j]+";");
                }
                writer.newLine();
            }
            writer.close();
            System.out.println("Writing successful");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Writing failed");
        }
    }
}
