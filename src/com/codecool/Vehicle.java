package com.codecool;

import java.util.Random;

abstract class Vehicle {
    String name;
    int normalSpeed;
    int distanceTraveled;

    public void moveForAnHour() {
        int speedForAnHour = this.normalSpeed;
        this.distanceTraveled += speedForAnHour;
    }

    public abstract boolean setBreakDown();

    public abstract void setNormalSpeedTo0();
}

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
        return normalSpeed=100;
    }

    public boolean setBreakDown() {
        boolean itIsBreakingDown = false;
        Random allCases = new Random(99);
        int chance = allCases.nextInt();
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

class Motorcycles extends Vehicle {

//    Motorcycle // speed is 100km/h. If it rains, travels with 5-50km/h slower (randomly).
//    static nameNumber // The number of the instance created. Used for its name.
//            name // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
//    distanceTraveled
//     moveForAnHour(Race race)

    static int counter = 0;

    public Motorcycles() {
        this.normalSpeed = getNormalSpeed();
        this.name=getMotorcyclesName() + counter;
        this.distanceTraveled = 0;

    }

    private String getMotorcyclesName(){
        String motorcyclesName = "Motorcycles ";
        counter++;
        return motorcyclesName;

    }

    private int getNormalSpeed() {
        int normalSpeed = 100;
        return normalSpeed;
    }


    private void setSlowDownSpeed() {
        this.normalSpeed = this.normalSpeed - ((int) (Math.random() * 45) + 5);

    }

    @Override
    public boolean setBreakDown() {
        return false;
    }

    @Override
    public void setNormalSpeedTo0() {

    }
}
