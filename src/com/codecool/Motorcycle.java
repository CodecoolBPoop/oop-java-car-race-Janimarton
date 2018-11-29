package com.codecool;

class Motorcycle extends Vehicle {

//    Motorcycle // speed is 100km/h. If it rains, travels with 5-50km/h slower (randomly).
//    static nameNumber // The number of the instance created. Used for its name.
//            name // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
//    distanceTraveled
//     moveForAnHour(Race race)

    static int counter = 0;

    public Motorcycle() {
        this.normalSpeed = getNormalSpeed();
        this.name = getMotorcyclesName() + counter;
        this.distanceTraveled = 0;

    }

    private String getMotorcyclesName() {
        String motorcyclesName = "Motorcycle ";
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