package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public Car(int cylinders, String name) {
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

    public  String startEngine(){

        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate(){

        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake(){

        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }


}
