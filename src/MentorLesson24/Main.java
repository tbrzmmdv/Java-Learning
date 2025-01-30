package MentorLesson24;

public class Main {
    public static void main(String[] args) {
        CarService carService=new CarService();


        Car car1 = new Car("BMW", "X5", 2022, 80000, CarType.SUV);
        Car car2 = new Car("Audi", "A4", 2021, 50000, CarType.SEDAN);
        Car car3 = new Car("Mercedes", "C200", 2023, 70000, CarType.COUPE);


        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);

        carService.getCarList().forEach(System.out::println);
        System.out.println("Cars Sorted by Price:");
        carService.sortedByPrice().forEach(System.out::println);

    }
}
