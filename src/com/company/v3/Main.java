package com.company.v3;

import com.company.v3.input.CommandLineInput;
import com.company.v3.input.Input;
import com.company.v3.number_repository.FileNumberRepository;
import com.company.v3.number_repository.NumberRepository;
import com.company.v3.operations.AddOperation;
import com.company.v3.operations.AvgOperation;
import com.company.v3.operations.Operation;

import java.io.IOException;

public class Main {

    //the dependency inversion principle is violated here
    public static void main(String[] args) throws IOException {

        //--read the operator using command line arguments
        Input input = new CommandLineInput();
        String operator = input.getOperator(args);
        NumberRepository numberRepository = (NumberRepository) new FileNumberRepository();
        int[] intNumbers = numberRepository.read();

        //--perform the operation
        double result = 0;
        Operation operation = null;
        if (operator.equals("+")) {
            operation = new AddOperation();
        } else if (operator.equals("avg")) {
            operation = new AvgOperation();
        }

        result = operation.perform(intNumbers);
        CommandLineOutput commandLineOutput = new CommandLineOutput();
        commandLineOutput.show("Result: " + result);
    }
}

