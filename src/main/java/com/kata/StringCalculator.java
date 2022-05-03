package com.kata;

public class StringCalculator {
    int add(String input) {
        if(StringCalculatorHandler.isInputEmpty(input))  return 0;
        if(input.length()==1) {
            return StringCalculatorHandler.convertStringToInt(input);
        }else{
            String[] inputSplitedByDelimiter = StringCalculatorHandler.splitInputByDelimiter(input);
            return StringCalculatorHandler.calculateSum(inputSplitedByDelimiter);

        }


    }

}
