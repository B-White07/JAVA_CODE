package com.icss_01;

public class Vehicle {
    private String carId;
    private int speed;
    private double size;

    public void speedUp(){
        speed++;
        System.out.println("车加速了");
    }

    public void speedDown(){
        speed--;
        System.out.println("车减速了");
    }

    public void updateCarId(String carId){
        this.carId = carId;
    }

    public double findSize(){
        return size;
    }

    public Vehicle() {
        carId = "XX1234";
        speed = 100;
        size = 100.00;
    }

    public Vehicle(String carId, int speed, double size) {
        this.carId = carId;
        this.speed = speed;
        this.size = size;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
