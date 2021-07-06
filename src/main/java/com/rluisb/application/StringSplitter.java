package com.rluisb.application;

import java.util.List;

public class StringSplitter {
    public static List<String> splitString(String str1, int n, List<String> stringPieces) {
        if (str1.length() <= n) {
            stringPieces.add(str1);
            return stringPieces;
        }

        stringPieces.add(str1.substring(0, n));

        return splitString(str1.substring(n), n, stringPieces);
    }
}
