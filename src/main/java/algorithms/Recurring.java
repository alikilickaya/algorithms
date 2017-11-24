package main.java.algorithms;

import main.java.constants.GeneralConstants;
import main.java.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Recurring {

    /**
     *
     * @param input
     * @return first recurring character
     */
    public static String firstRecurring(String input) {
        if(StringUtils.isEmpty(input)) {
            return GeneralConstants.INVALID_INPUT;
        }

        char[] A = input.toCharArray();
        List<Character> checkList = new ArrayList<>();
        checkList.add(A[0]);
        String result = "";
        for (int i=1; i<input.length(); i++) {
            if(checkList.contains(A[i])) {
                result = String.valueOf(A[i]);
                break;
            } else {
                checkList.add(A[i]);
            }
        }

        return result.isEmpty() ? GeneralConstants.NOT_FOUND : result;
    }
}
