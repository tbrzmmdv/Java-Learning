package MentorLesson6;

public class Circle extends Shape implements Resizable{
    public int radius;

    @Override
    public void area() {
        System.out.println("The area is "+Math.PI*radius*radius);
    }

    @Override
    public void resize(double factor) {
        System.out.println(factor*10);
    }

    @Override
    public void reset() {
        System.out.println(0);
    }
}
