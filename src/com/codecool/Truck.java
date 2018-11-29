package com.codecool;

import java.util.Random;

class Truck extends Vehicle {
    private final boolean isBreakDown;

//    Truck // speed: 100km/h. 5% chance of breaking down for 2 hours.
//            // Truck drivers are boring. They call all their trucks a random number between 0 and 1000.
//            breakdownTurnsLeft // holds how long its still broken down.
//    distanceTraveled
//    moveForAnHour(Race race)

    public Truck() {
        this.name = getTruckName();
        this.normalSpeed = getNormalSpeed();
        this.distanceTraveled = 0;
        this.isBreakDown = setBreakDown();
    }

    private String getTruckName() {
        String truckName = String.valueOf((int) (Math.random() * 1000));
        return truckName;
    }

    private int getNormalSpeed() {
        return normalSpeed = 100;
    }

    public boolean setBreakDown() {
        boolean itIsBreakingDown = false;
        Random allCases = new Random();
        int chance = allCases.nextInt(99);
        if (chance <= 4) {
            itIsBreakingDown = true;
        }
        return itIsBreakingDown;
    }

    @Override
    public void setNormalSpeedTo0() {
        this.normalSpeed = 0;
    }


}
