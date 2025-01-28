package MentorLesson8;

public class ElectricScooter extends Vehicle implements Driveable{
    public ElectricScooter(String id, String name) {
        super(id, name);
    }

    @Override
    public String showDetails() {
        return "Id:"+id+" name:"+name;
    }

    @Override
    public void startDriving() {
        System.out.println("ElectricScooter is started driving");
    }

    @Override
    public void stopDriving() {
        System.out.println("ElectricScooter is stoped driving");

    }
}
