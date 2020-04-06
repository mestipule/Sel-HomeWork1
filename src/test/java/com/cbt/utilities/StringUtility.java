package com.cbt.utilities;

public class StringUtility {
    public static String verifyEquals(String expected, String actual) {
        String result = "";
        if (expected.equals(actual)) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        return result;
    }
}
