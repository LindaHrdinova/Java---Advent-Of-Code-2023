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

    }
}
