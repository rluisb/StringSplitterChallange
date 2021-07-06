package com.rluisb.application;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.rluisb.application.StringSplitter.splitString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSplitterTest {
    @Test
    void shouldSplitAtwentyFiveLengthStringFiveCharactersAtTime() {
        String str = "abcdefghijklmnopqrstuvwxy";
        int split_number = 5;
        splitString(str, split_number, new ArrayList<>()).forEach(pieceOfString -> assertEquals(pieceOfString.length(), split_number));
    }

    @Test
    void shouldSplitAtwentySixLengthStringFiveCharactersAtTimeAndLastPieceShouldBeEqualOne() {
        String str = "abcdefghijklmnopqrstuvwxyz";
        int split_number = 5;
        List<String> response = splitString(str, split_number, new ArrayList<>());

        assertEquals(response.get(response.size() - 1).length(), 1);
    }
}
