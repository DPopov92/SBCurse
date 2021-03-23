package ru.sber.javaschool;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        SpaceCreator spaceCreator = new SpaceCreator();
        spaceCreator.execute();
    }
}
