package com.codecool;

import java.util.*;

public class Weather {

//    static setRaining() // 30% chance of rain.
//    static boolean isRaining() // is it raining currently.

    private static boolean setRaining(){
        boolean itIsRaining = false;
        Random allCases = new Random(9);
        int chance = allCases.nextInt();
        if (chance <= 2){
            itIsRaining = true;
        }
        return itIsRaining;
    }

    static boolean isRaining(){
        boolean currentlyRaining = setRaining();
        return currentlyRaining;
    }


}
