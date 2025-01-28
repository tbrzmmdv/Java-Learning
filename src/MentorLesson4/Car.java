package MentorLesson4;

public class Car extends Vehicle{

    public String fuelType;

    public Car(String name, int speed, String fuelType) {
        super(name, speed);
        this.fuelType = fuelType;
    }

    @Override
    public void move(){
        System.out.println("Car is moving at "+speed+" Using fuelType "+ fuelType+".");
    }
}
