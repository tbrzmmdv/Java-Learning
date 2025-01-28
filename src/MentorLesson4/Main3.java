package MentorLesson4;

public class Main3 {
    public static void main(String[] args) {
        Vehicle[] vehicles=new Vehicle[2];

        vehicles[0]=new Car("Hyundai",206,"Gas");
        vehicles[1]=new Bicycle("Star",30,6);

        for (Vehicle vehicle:vehicles){
            vehicle.move();
        }

    }

}
