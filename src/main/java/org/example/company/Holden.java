package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Holden's engine is starting");
        getClass().getSimpleName();
    }

    @Override
    public void accelerate() {
        System.out.println("Holden is accelerating");
        getClass().getSimpleName();
    }

    @Override
    public void brake() {
        System.out.println("Holden is braking");
        getClass().getSimpleName();
    }
}
