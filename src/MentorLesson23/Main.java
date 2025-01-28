package MentorLesson23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products= Arrays.asList(
                new Product("Futbol topu","Idman",100),
                new Product("Forma","Idman",50),
                new Product("T-shirt","Geyim",70),
                new Product("Mator","Avtomobil",2000)
        );
        double priceForSorting=200;
        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getPrice() > priceForSorting)
                .collect(Collectors.toList());

        System.out.println("Qiymeti " + priceForSorting + " -den cox olanlar:");
        filteredProducts.forEach(System.out::println);


        List<Product> filteredForName=products.stream()
                .sorted(Comparator.comparing(Product::getName))
                .collect(Collectors.toList());

        System.out.println("\nAda gore siralananlar:");
        filteredForName.forEach(System.out::println);

        List<Product> filteredForPrice=products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        System.out.println("\nQiymete gore siralananlar:");
        filteredForPrice.forEach(System.out::println);

        List<Product> rangedFilter=products.stream()
                .filter(p -> p.getPrice()>=100 && p.getPrice()<=500)
                .collect(Collectors.toList());

        System.out.println("\nQiymeti 100 ile 500 arasındakiler:");
        rangedFilter.forEach(System.out::println);

    }
}
