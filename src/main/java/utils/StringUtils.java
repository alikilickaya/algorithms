package main.java.utils;

import java.util.Collection;
import java.util.Iterator;

public class StringUtils {
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty() ? true : false;
    }

    public static String collectionToString(Collection list) {
        String result = "";
        if(list != null) {
            for(Object a : list) {
                result += a;
            }
        }

        return result;
    }
}
