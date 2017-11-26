package main.java.algorithms;

import main.java.utils.StringUtils;

public class LongestConsecutive {
    /**
     *
     * @param input
     * @return LongestConsecutive character
     */
    public static Character getLongestConsecutive(String input) {
        if (StringUtils.isEmpty(input)) {
            return null;
        }

        Character previous = null;
        Character longestChar = null;
        int count = 1;
        int maxLength = 0;
        for(int i=0; i<input.length(); i++) {
            Character currentChar = input.charAt(i);
            if (currentChar.equals(previous)) {
                count += 1;
            } else {
                count = 1;
            }

            if (count > maxLength) {
                maxLength = count;
                longestChar = currentChar;
            }

            previous = currentChar;
        }

        return longestChar;
    }
}
