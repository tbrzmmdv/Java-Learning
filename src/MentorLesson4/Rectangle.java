package MentorLesson4;

public class Rectangle extends Shape{
    public int side;

    public Rectangle(String name, int side) {
        super(name);
        this.side = side;
    }
    @Override
    public void describeShape(){
        System.out.println("This is Rectangle");
    }
}
