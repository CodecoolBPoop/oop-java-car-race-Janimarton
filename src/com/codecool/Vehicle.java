package com.codecool;

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
