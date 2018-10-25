package com.codecool;

import java.util.Random;

abstract class Vehicle {
    String name;
    int normalSpeed;
    int distanceTraveled;

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
        String carNames = cars[new Random().nextInt(cars.length)];
        carNames = carNames + " " + cars[new Random().nextInt(cars.length)];
        return carNames;
    }

    private int getNormalSpeed() {
        int normalSpeed = (int) (Math.random() * 30) + 80;
        return normalSpeed;
    }

    public void setNormalSpeedToMax() {
        int maxSpeed = 75;
        this.normalSpeed = maxSpeed;
    }

    public void moveForAnHour() {
        int speedForAnHour = this.normalSpeed;
        this.distanceTraveled += speedForAnHour;
    }
}

class Truck extends Vehicle {
//    Truck // speed: 100km/h. 5% chance of breaking down for 2 hours.
//            // Truck drivers are boring. They call all their trucks a random number between 0 and 1000.
//            breakdownTurnsLeft // holds how long its still broken down.
//    distanceTraveled
//    moveForAnHour(Race race)

}

class Motorcycles extends Vehicle {
//    Motorcycle // speed is 100km/h. If it rains, travels with 5-50km/h slower (randomly).
//    static nameNumber // The number of the instance created. Used for its name.
//            name // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
//    distanceTraveled
//     moveForAnHour(Race race)

}
