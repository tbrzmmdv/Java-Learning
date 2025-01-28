package MentorLesson8;

public class Car extends Vehicle implements Fuelable,Driveable{
    public Car(String id, String name) {
        super(id, name);
    }

    @Override
    public String showDetails() {
        return "Id:"+id+" name:"+name;
    }

    @Override
    public void refuel() {
        System.out.println("Car is refueling");

    }

    @Override
    public void stopRefueling() {
        System.out.println("Car is stopped fueling");

    }

    @Override
    public void startDriving() {
        System.out.println("Car is started driving");

    }

    @Override
    public void stopDriving() {
        System.out.println("Car is stoped driving");

    }
}
