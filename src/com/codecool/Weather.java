package com.codecool;

import java.util.*;

public class Weather {
    private static boolean currentlyRaining = false;

//    static setRaining() // 30% chance of rain.
//    static boolean isRaining() // is it raining currently.

    private static void setRaining() {
        boolean itIsRaining = false;
        Random allCases = new Random();
        int chance = allCases.nextInt(9);
        if (chance <= 2) {
            itIsRaining = true;
        }
        currentlyRaining = itIsRaining;
    }

    static boolean isRaining() {
        return currentlyRaining;
    }


}
