public abstract class VehicleDB {
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelEfficiency;
    private double fuel;

    public VehicleDB(String make, String model, int year, String fuelType, double fuelEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
        this.fuel = 0;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public double getFuel() {
        return fuel;
    }

    public void refuel(double liters) {
        if (liters > 0) {
            fuel += liters;
            System.out
                    .println(make + " " + model + " refueled with " + liters + " liters. Total fuel: " + fuel + " L.");
        } else {
            System.out.println("Invalid fuel amount.");
        }
    }

    public abstract double calculateFuelEfficiency();

    public abstract double calculateDistanceTraveled();

    public abstract double getMaxSpeed();
}
