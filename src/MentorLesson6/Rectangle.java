package MentorLesson6;

public class Rectangle extends Shape implements Resizable{

    public int length;
    public int width;


    @Override
    public void area() {
        System.out.println("Area is "+length*width);

    }

    @Override
    public void resize(double factor) {

    }

    @Override
    public void reset() {

    }
}
