import java.util.Scanner;

public class GarageSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garage garage = new Garage();

        while (true) {
            System.out.println("""
                    1. Добавить транспорт
                    2. Вывести все транспорты
                    3. Удалить транспорт
                    0. Завершить""");
            int command = Integer.parseInt(scanner.nextLine());
            if (command == 1) {
                VehicleType[] types = VehicleType.values();
                for (int i = 0; i < types.length; i++) {
                    System.out.println(i + 1 + ". " + types[i]);
                }

                // 1. BIKE
                // 2. CAR

                //   0     1
                // [BIKE, CAR]

                int typeNumber = Integer.parseInt(scanner.nextLine());
                VehicleType type = types[typeNumber - 1];

                switch (type) {
                    case CAR -> {
                        // запрашиваете название автомобиля
//                        Car car = new Car();
//                        garage.add(car);
                    }
                    case BIKE -> {
                        // запрашиваете название велосипеда
                        new Bike("");
                        // добавляете в гараж
                    }
                }
                // Добавлено ...

            }
        }
    }
}
