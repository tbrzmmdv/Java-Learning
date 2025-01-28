package MentorLesson4;

public class Vehicle {
    public String name;
    public int speed;

    public void move(){
        System.out.println("Vehicle is moving");
    }

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
}
