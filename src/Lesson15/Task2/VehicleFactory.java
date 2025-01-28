package Lesson15.Task2;


class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("cAr")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bIKe")) {
            return new Bike();
        }
        return null;
    }
}
