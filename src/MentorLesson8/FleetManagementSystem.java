package MentorLesson8;

import java.util.Objects;

public class FleetManagementSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=new Car("1212","Toyota");
        vehicles[1]=new Bike("3232","Star");
        vehicles[2]=new ElectricScooter("9393","Waze");

        for (Vehicle vehicle :vehicles){
            handFuelable(vehicle);
            handDriveable(vehicle);
        }
    }

    public static void handFuelable(Vehicle vehicle){
        if (Objects.nonNull(vehicle) && vehicle instanceof Fuelable fuelable){
            fuelable.refuel();
            fuelable.stopRefueling();
        }

    }
    public static void handDriveable(Vehicle vehicle){
        if (Objects.nonNull(vehicle) && vehicle instanceof Driveable driveable){
            driveable.startDriving();
            driveable.stopDriving();

        }
    }

}
