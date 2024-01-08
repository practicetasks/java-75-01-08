public class Garage {
    private final Vehicle[] vehicles;

    public Garage() {
        this.vehicles = new Vehicle[5];
    }

    public void displayAllByType(VehicleType type) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null && vehicle.getType() == type) {
                System.out.println("- " + vehicle.getName());
            }
        }
    }

    public void swap(int a, int b) {
        Vehicle vehicle = vehicles[a];
        vehicles[a] = vehicles[b];
        vehicles[b] = vehicle;
    }

    public void displayCountOfEachType() {
        int bike = 0;
        int car = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle == null) continue;

            switch (vehicle.getType()) {
                case BIKE -> bike++;
                case CAR -> car++;
            }
        }

        System.out.println("\nКоличество велосипедов: " + bike);
        System.out.println("Количество машин: " + car);
    }

    public void displayAll() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle == null) continue;
            System.out.println("Тип: " + vehicle.getType());
            System.out.println("Название: " + vehicle.getName() + "\n");
        }
    }

    public void add(Vehicle vehicle) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = vehicle;
                return;
            }
        }
    }

    public void remove(Vehicle vehicle) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null && vehicles[i].equals(vehicle)) {
                vehicles[i] = null;
                return;
            }
        }
    }

    void displayAllWithNum() {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) continue;
            Vehicle vehicle = vehicles[i];
            System.out.println(i + 1 + ". " + vehicle.getType() + " " + vehicle.getName());
        }
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }
}
