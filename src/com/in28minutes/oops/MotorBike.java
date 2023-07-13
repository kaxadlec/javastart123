package com.in28minutes.oops;

public class MotorBike {
    void start(){
        System.out.println("Bike Start");
    }

    //state
    private int speed;
    //behavior

    // method
    // inputs - int speed
    // outputs - void
    // name - setSpeed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0)
            this.speed = speed;
    }

    public void increaseSpeed(int howMuch){
        this.speed += howMuch;
    }

}
