package com.codecool;

import java.util.ArrayList;
import java.util.Objects;

public class Race {

//    createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles.
//    simulateRace() // simulates the race by
//    // - calling moveForAnHour() on every vehicle 50 times
//    // - setting whether its raining
//    printRaceResults() // prints each vehicle's name, distance traveled ant type.
//    boolean isThereABrokenTruck() //

    public static void main(String[] args) {
        System.out.println("The race begins \n");
        System.out.println("The cars: \n");
        Car [] cars = new Car[10];
        for (int i=0; i<cars.length; i++){
            cars[i] = new Car();
        }
        for (Car car : cars) {
            System.out.println(car.name + " is goes " + car.normalSpeed + " km/h to: " + car.distanceTraveled);
        }
        cars[0].moveForAnHour();
        System.out.println(cars[0].distanceTraveled +"\n");
        System.out.println("The trucks: \n");
        Truck [] trucks = new Truck[10];
        for (int i = 0; i < trucks.length; i++) {
            trucks[i] = new Truck();
        }
        for (Truck truck:
             trucks) {
            System.out.println(truck.name + " is goes " + truck.normalSpeed + " km/h to: " + truck.distanceTraveled);

        }
        trucks[0].moveForAnHour();
        System.out.println(trucks[0].distanceTraveled);

    }
}
