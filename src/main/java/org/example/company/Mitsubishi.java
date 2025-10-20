package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi( int cylinders,String name) {
        super( cylinders,name);
    }



    @Override
    public void startEngine() {
        System.out.println("Mitsubishi's engine is starting");
        getClass().getSimpleName();
    }

    @Override
    public void accelerate() {
        System.out.println("Mitsubishi is accelerating");
        getClass().getSimpleName();
    }

    @Override
    public void brake() {
        System.out.println("Mitsubishi is braking");
        getClass().getSimpleName();
    }
}
