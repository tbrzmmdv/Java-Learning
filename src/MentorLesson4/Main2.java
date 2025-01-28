package MentorLesson4;

public class Main2 {
    public static void main(String[] args) {
        Shape[] shapes= new Shape[2];
        shapes[0]=new Rectangle("Rectangle",4);
        shapes[1]=new Circle("Circle",3);

        for (Shape shaps:shapes){
            shaps.describeShape();
        }










    }


}
