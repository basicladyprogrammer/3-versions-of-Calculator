package com.company.v3.operations;

public class AvgOperation implements Operation {
    public double perform (int[] numbers) { //todo: change this name later
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result / numbers.length;
    }
}
