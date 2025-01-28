package Lesson15.Task2;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.createVehicle("car");
        vehicle1.drive();

        Vehicle vehicle2 = VehicleFactory.createVehicle("bike");
        vehicle2.drive();
    }
}

