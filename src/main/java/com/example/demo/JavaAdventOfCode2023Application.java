package com.example.demo;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.readAllLines;

public class JavaAdventOfCode2023Application {
    public static void main(String[] args) throws IOException {
        List<String> lines = readAllLines(Path.of("src\\main\\resources\\inputTrebuchet.txt"));
        System.out.println("Input:");

        List<Integer> numbers = new ArrayList<>();

        // for each string in input
        for (int i = 0; i < lines.size(); i++) {
            List<Character> digits = new ArrayList<>();
            String line = lines.get(i);
            System.out.println(line);

            // find digits in string
            for (int j = 0; j < line.length(); j++) {
                if (Character.isDigit(line.charAt(j))) {
                    digits.add(line.charAt(j));
                }
            }

            // find first and last digit
            int firstDigit = digits.getFirst();
            int lastDigit = digits.getLast();
            int number = (Character.getNumericValue(firstDigit) * 10) + Character.getNumericValue(lastDigit);
            numbers.add(number);
        }

        // sum of numbers
        int resultNumber = 0;
        for (Integer number : numbers) {
            resultNumber += number;
        }
        System.out.println("Result: " + resultNumber);
    }
}
