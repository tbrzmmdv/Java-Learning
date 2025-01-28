package MentorLesson4;

public class Circle extends Shape{
    public int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void describeShape(){
        System.out.println("This is Circle");
    }
}
