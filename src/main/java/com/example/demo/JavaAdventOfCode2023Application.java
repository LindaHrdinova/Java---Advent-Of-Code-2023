package com.example.demo;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.readAllLines;

public class JavaAdventOfCode2023Application {
    public static void main(String[] args) throws IOException {
        List<String> lines = readAllLines(Path.of("src\\main\\resources\\line.txt"));
        System.out.println(lines);

        for (int i = 0; i < lines.size(); i++) {
            List<Character> digits = new ArrayList<>();
            String line = lines.get(i);
            System.out.println(line);
            for (int j = 0; j < line.length(); j++) {
                if (Character.isDigit(line.charAt(j))) {
                    digits.add(line.charAt(j));
                }
            }
            System.out.println(digits);
        }

    }
}
