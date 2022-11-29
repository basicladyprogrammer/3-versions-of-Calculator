package com.company.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository {
    public int[] read() throws IOException {//todo: change the exception handling mechanism
        //read the numbers from the text files
        List<String> lines = Files.readAllLines(Paths.get("F:\\SConstruction\\src\\com\\company\\numbers.txt"));
        String firstLine = lines.get(0);
        //split first line by comma
        String[] numbers = firstLine.split(",");

        //covert numbers into integers
        int[] intNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }
        return intNumbers;
    }
}
