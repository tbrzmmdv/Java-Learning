package MentorLesson8;

public class Bike extends Vehicle implements Driveable{
    public Bike(String id, String name) {
        super(id, name);
    }

    @Override
    public String showDetails() {
        return "Id:"+id+" name:"+name;
    }

    @Override
    public void startDriving() {
        System.out.println("Bike is started driving");
    }

    @Override
    public void stopDriving() {
        System.out.println("Bike is stoped driving");

    }
}
