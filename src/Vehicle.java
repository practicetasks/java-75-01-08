public class Vehicle {
    private String name;
    private int amountOfWheels;
    private VehicleType type;

    public Vehicle(String name, int amountOfWheels, VehicleType type) {
        this.name = name;
        this.amountOfWheels = amountOfWheels;
        this.type = type;
    }

    public VehicleType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    public void setAmountOfWheels(int amountOfWheels) {
        this.amountOfWheels = amountOfWheels;
    }
}
