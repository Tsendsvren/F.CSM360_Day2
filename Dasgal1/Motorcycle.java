public class Motorcycle extends Vehicle {
    private double engineDisplacement;

    public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency,
            double engineDisplacement) {
        super(make, model, year, fuelType, fuelEfficiency);
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency() * (1.0 / (1.0 + engineDisplacement / 1000.0));
    }

    @Override
    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        return 80.0;
    }
}
