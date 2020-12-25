package ru.homework.java.core;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data){
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public void save(String filePath){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false));
            for (int i = 0; i <header.length; i++) {
                writer.write(header[i]+";");
            }
            writer.newLine();
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    writer.write(data[i][j]+";");
                }
                writer.newLine();
            }
            writer.close();
            System.out.println("Saving successful");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Saving failed");
        }
    }
}
