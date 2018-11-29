package com.codecool;

import java.util.Random;

class Car extends Vehicle {

//    normalSpeed // the normal speed of the car. Set to a random number in the constructor between 80-110km/h.
//            name // Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php
// and pick 2 randomly for each instance.
//    distanceTraveled // holds the current distance traveled.
//    moveForAnHour(Race race) // The vehicle travels for an hour. It increases the distance traveled.
// Call this from the main class only!
//    // If there is a broken down Truck on the track, then limit the max speed of vehicles to 75 km/h.

    public Car() {
        this.name = getCarName();
        this.normalSpeed = getNormalSpeed();
        this.distanceTraveled = 0;


    }

    private String[] cars = {"Expedition", "Purity", "Eminance", "Supremacy", "Blast", "Specter", "Eon", "Capital",
            "Empyrean", "Revelation"};

    private String getCarName() {
        String carName = cars[new Random().nextInt(cars.length)];
        carName = carName + " " + cars[new Random().nextInt(cars.length)];
        return carName;
    }

    private int getNormalSpeed() {
        int normalSpeed = (int) (Math.random() * 30) + 80;
        return normalSpeed;
    }

    public void setNormalSpeedToMax() {
        this.normalSpeed = 75;
    }


    @Override
    public boolean setBreakDown() {
        return false;
    }

    @Override
    public void setNormalSpeedTo0() {

    }
}