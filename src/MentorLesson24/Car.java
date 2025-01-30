package MentorLesson24;

import java.util.UUID;

public class Car {
    private String brand;
    private String model;
    private int year;

    private double price;

    private UUID id;

    private CarType type;

    public Car(String brand, String model, int year, double price,CarType type) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.id = UUID.randomUUID();
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", id=" + id +
                ", type=" + type +
                '}';
    }
}
