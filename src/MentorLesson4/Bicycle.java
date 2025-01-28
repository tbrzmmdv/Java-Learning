package MentorLesson4;

public class Bicycle extends Vehicle{
    public int gearCount;

    public Bicycle(String name, int speed, int gearCount) {
        super(name, speed);
        this.gearCount = gearCount;
    }

    @Override
    public void move(){
        System.out.println("Bicycle is moving at "+speed+" km/h with "+gearCount+" gears.");
    }



}
