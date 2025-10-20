package org.example.arge;

public class HybridCar extends CarSkeleton{

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getName()+ " HybridEngine started.");

    }

    @Override
    public void drive() {
        System.out.println("You are driving a gas and electric powered car.");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("HybridEngine is running.");
    }
}
