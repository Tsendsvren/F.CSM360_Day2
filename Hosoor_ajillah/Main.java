public class Main {
    public static void main(String[] args) {
        // Truck объект
        TruckDB truck = new TruckDB("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);

        // Car объект
        CarDB car = new CarDB("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);

        // Motorcycle объект
        MotorcycleDB motorcycle = new MotorcycleDB("Massimo Motor", "Warrior200", 2018, "GASOLINE", 2.1, 0);

        System.out.println("Truck Model: " + truck.getModel());
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph\n");

        System.out.println("Car Model: " + car.getModel());
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + car.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " mph\n");

        System.out.println("Motorcycle Model: " + motorcycle.getModel());
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + motorcycle.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " mph");
    }
}
