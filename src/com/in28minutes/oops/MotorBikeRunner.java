package com.in28minutes.oops;

public class MotorBikeRunner {
    public static void main(String[] args) {
//        MotorBike ducati = new MotorBike();
//        MotorBike honda = new MotorBike();
        MotorBike ducati = new MotorBike(50);
        MotorBike honda = new MotorBike(30);
        MotorBike some = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        ducati.increaseSpeed(20);
        honda.increaseSpeed(40);
        ducati.decreaseSpeed(10);
        honda.decreaseSpeed(60);

        System.out.println(some.getSpeed());
        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
    }
}
