package main.java.algorithms;

import main.java.constants.GeneralConstants;
import main.java.utils.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Recurring {

    /**
     *
     * @param input
     * @return first recurring character
     */
    public static String getFirstRecurring(String input) {
        if(StringUtils.isEmpty(input)) {
            return GeneralConstants.INVALID_INPUT;
        }

        List<Character> checkList = new ArrayList<>();
        checkList.add(input.charAt(0));
        String result = "";
        for (int i=1; i<input.length(); i++) {
            char current = input.charAt(i);
            if(checkList.contains(input.charAt(i))) {
                result = String.valueOf(current);
                break;
            } else {
                checkList.add(current);
            }
        }

        return result;
    }

    /**
     *
     * @param input
     * @return recurring all characters
     * example: input: "ABBCCDX"
     *          return: "BC"
     */
    public static String getAllRecurrings(String input) {
        if(StringUtils.isEmpty(input)) {
            return GeneralConstants.INVALID_INPUT;
        }

        String result = "";
        Set<String> checkList = new HashSet<>();
        checkList.add(String.valueOf(input.charAt(0)));

        for (int i = 1; i < input.length() ; i++) {
            String current = String.valueOf(input.charAt(i));
            if (checkList.contains(current)) {
                if(!result.contains(current)) {
                    result += current;
                }
            } else {
                checkList.add(current);
            }
        }

        return result;
    }
}
