package com.codecool;

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

        Vehicle[] vehicles = new Vehicle[30];
        int vehicleIdx = 0;

        Car[] cars = new Car[10];
        for (int i = 0; i < cars.length; i++) {
            Car car = new Car();
            cars[i] = car;
            vehicles[vehicleIdx++] = car;
        }

        Truck[] trucks = new Truck[10];
        for (int i = 0; i < trucks.length; i++) {
            trucks[i] = new Truck();
            vehicles[vehicleIdx++] = trucks[i];
        }

        Motorcycle[] motorcycles = new Motorcycle[10];
        for (int i = 0; i < motorcycles.length; i++) {
            motorcycles[i] = new Motorcycle();
            vehicles[vehicleIdx++] = motorcycles[i];
        }
        int stoppedRound = 0;
        // TODO: 2018.11.06. Draw a flowchart
        for (int i = 0; i < 50; i++) {
            for (Vehicle vehicle : vehicles) {
                vehicle.moveForAnHour();
                if (vehicle.setBreakDown()) {
                    if (stoppedRound < 2) {
                        vehicle.setNormalSpeedTo0();
                    }
                    stoppedRound++;
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
        for (Motorcycle motorcycle :
                motorcycles) {
            System.out.println("The " + motorcycle.name + " is goes: " + motorcycle.distanceTraveled);
        }

    }
}
