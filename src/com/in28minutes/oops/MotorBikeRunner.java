package com.in28minutes.oops;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        ducati.increaseSpeed(20);
        honda.increaseSpeed(40);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
    }
}
