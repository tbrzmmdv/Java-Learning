package MentorLesson24;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class CarService {

    private List<Car> carList = new ArrayList<>();


    public void addCar(Car car) {
        carList.add(car);
    }

    public List<Car> getCarList(){
        return carList;
    }

    public void updateCars(UUID id,Car newCar){
        Car car=carList.stream()
                .filter(car1 -> car1.getId().equals(id))
                .findFirst()
                .orElseThrow();

        car.setBrand(newCar.getBrand());
        car.setModel(newCar.getModel());
        car.setPrice(newCar.getPrice());
        car.setYear(newCar.getYear());
        car.setType(newCar.getType());
    }

    public void idDelete(UUID id){
        carList.removeIf(car -> car.getId().equals(id));
    }

    public List<Car> sortedByPrice(){
        return carList.stream()
                .sorted(Comparator.comparingDouble(Car::getPrice))
                .collect(Collectors.toList());
    }

}
