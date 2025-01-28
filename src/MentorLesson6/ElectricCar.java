package MentorLesson6;

public class ElectricCar extends Car{
    @Override
    public void start(){
        System.out.println("ElectricCar is starting");
    }
    @Override
    public void stop(){
        System.out.println("ElectricCar is stoping");
    }
}
