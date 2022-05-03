package com.kata;

import org.apache.commons.lang3.StringUtils;

public class  StringCalculatorHandler {
    public static final String DELIMITER=",";

    static boolean isInputEmpty(String input) {
        return input.length() == 0;
    }

    static int convertStringToInt(String str) {
        Integer number = null;
        try {
            number = Integer.valueOf(str);
        } catch (NumberFormatException ex) {
            throw new NumberFormatException(String.format("(%s) not allowed",str));

        }
        return number;
    }

    static String[] splitInputByDelimiter(String input) {
        return input.split(DELIMITER);
    }
}
