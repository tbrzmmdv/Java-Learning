package Lesson22;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    static List<Integer> integers = new ArrayList<>();

//        integers.add(98);
//        integers.add(65);
//        integers.add(77);
//        integers.add(7);
//        integers.add(22);
//        integers.add(87);
//        integers.add(33);
//        integers.add(14);
//        integers.add(76);
//        integers.add(55);

    public static int minimumNumber() {
        int minimumNumber = integers.get(0);

        for (int i = 1; i < integers.size(); i++) {
            int currentNumber = integers.get(i);
            if (currentNumber < minimumNumber) {
                minimumNumber = currentNumber;
            }
        }
        return minimumNumber;

    }



    public static double edediOrta() {
        int ededler = integers.size();
        int sum = 0;
        for (Integer i : integers) {
            sum += i;
        }

        return (double) sum / ededler;

    }


    public static int sum() {
        int sum = 0;
        for (Integer i : integers) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        integers.add(98);
        integers.add(65);
        integers.add(77);
        integers.add(7);
        integers.add(22);
        integers.add(87);
        integers.add(33);
        integers.add(14);
        integers.add(76);
        integers.add(55);

        System.out.println("Sum:" + sum());
        System.out.println("Average:" + edediOrta());
        System.out.println("Minimum number:"+minimumNumber());

    }
}
