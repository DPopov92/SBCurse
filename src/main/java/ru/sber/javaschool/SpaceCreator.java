package ru.sber.javaschool;

import lombok.Setter;

import java.io.*;
import java.util.Scanner;

public class SpaceCreator {

    public void execute() {
        String path;
        String symbol;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, путь до файла:");
        path = scanner.nextLine();
        System.out.println("Введите символ, который хотите заменить:");
        symbol = scanner.next();
        writeInFile(changeOnSpace(readFromFile(path), symbol));
        System.out.println("Done");
    }

    private String readFromFile(String path) {
        StringBuilder sb = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(path);
            int c;
            while ((c = fileReader.read()) != -1) {
                sb.append((char) c);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    private String changeOnSpace(String text, String symbol) {
        StringBuilder result = new StringBuilder();
        String[] splitedText = text.split(symbol);
        for (String s : splitedText) {
            result.append(s).append(" ");
        }
        return result.toString().trim();
    }

    private void writeInFile(String text) {
        try {
            FileWriter fileWriter = new FileWriter("result.txt");
            fileWriter.write(text);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
