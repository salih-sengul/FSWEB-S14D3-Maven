package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {

        CarSkeleton gasCar = new GasPoweredCar("Ford Mustang", "Classic muscle car", 8.5, 8);
        CarSkeleton electricCar = new ElectricCar("Tesla Model 3", "Modern electric sedan", 450, 75);
        CarSkeleton hybridCar = new HybridCar("Toyota Prius", "Eco-friendly hybrid car", 22.0, 20, 4);

        testCar(gasCar);
        testCar(electricCar);
        testCar(hybridCar);
    }

    public static void testCar(CarSkeleton car) {
        System.out.println("🚘 Testing Car Type: " + car.getClass().getSimpleName());
        car.startEngine();
        car.drive();
        System.out.println("---------------------------");
    }
}