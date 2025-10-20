package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        engine = true;
        wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", name='" + name + '\'' +
                ", cylinders=" + cylinders +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    public  void startEngine(){
        System.out.println("the car's engine is starting");
        getClass().getSimpleName();
    }

    public void accelerate(){
        System.out.println("the car is accelerating");
        getClass().getSimpleName();
    }

    public void brake(){
        System.out.println("the car is braking");
        getClass().getSimpleName();
    }


}
