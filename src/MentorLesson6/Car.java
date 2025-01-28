package MentorLesson6;

public abstract class Car implements Vehicle {
    String fuelType;

    public void start(){
        System.out.println("Car is starting");
    }

    public void stop(){
        System.out.println("Car is stoping");
    }
}
