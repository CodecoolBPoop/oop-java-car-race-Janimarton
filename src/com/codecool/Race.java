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
//        Objects[] vehicles = new Objects[30];

        Vehicle[]vehicles = new Vehicle[30];

        Car[] cars = new Car[10];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            vehicles[i] = cars[i];
        }

        Truck[] trucks = new Truck[10];
        for (int i = 0; i < trucks.length; i++) {
            trucks[i] = new Truck();
            vehicles[i+10]=trucks[i];
        }

        Motorcycles[] motorcycles = new Motorcycles[10];
        for (int i = 0; i < motorcycles.length; i++) {
            motorcycles[i] = new Motorcycles();
            vehicles[i+20]=motorcycles[i];
        }

        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < vehicles.length; j++) {
                vehicles[j].moveForAnHour();
                if (vehicles[j].setBreakDown()){
                    int stoppedRound =0;
                    while (stoppedRound<2){
                        vehicles[j].setNormalSpeedTo0();
                        stoppedRound++;
                    }
                }

            }
        }

        System.out.println("The car part: \n");
        for (Car car :
                cars) {
            System.out.println("The " + car.name + " is goes: " + car.distanceTraveled);
        }
        System.out.println("\n The truck part: \n");
        for (Truck truck :
                trucks) {
            System.out.println("The " + truck.name + " is goes: " + truck.distanceTraveled);
        }
        System.out.println("\n The motorcycle part: \n");
        for (Motorcycles motorcycle :
                motorcycles) {
            System.out.println("The " + motorcycle.name + " is goes: " + motorcycle.distanceTraveled);
        }

    }
}
