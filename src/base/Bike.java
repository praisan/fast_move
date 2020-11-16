package base;

public class Bike {
    private static String licensePlate;
    private int engineCapacity;

    public Bike(String licensePlate, int engineCapacity) {
        this.licensePlate = licensePlate;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Bike licensePlate:" + licensePlate + ", engine: " + engineCapacity + " CC";
    }
    
}
