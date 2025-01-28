package Lesson22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();


        for (int i = 0; i < 100000; i++) {
            arrayList.add("Student" + i);
            linkedList.add("Student" + i);
        }

        System.out.println("ArrayList performance:");
        performance(arrayList);

        System.out.println("\nLinkedList performance:");
        performance(linkedList);
    }


    private static void performance(List<String> list) {
        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.add(0,"New Student");
        }
        endTime = System.nanoTime();
        System.out.println("Basa elave etme: " + (endTime - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.add("New Student");
        }
        endTime = System.nanoTime();
        System.out.println("Sona elave etme: " + (endTime - startTime));


        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.add(list.size() / 2, "NewStudent");
        }
        endTime = System.nanoTime();
        System.out.println("Ortaya elave etme: " + (endTime - startTime));


        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.remove(list.size() / 2);
        }
        endTime = System.nanoTime();
        System.out.println("Ortadan cixartma " + (endTime - startTime));


        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.contains("Student" + i);
        }
        endTime = System.nanoTime();
        System.out.println("Axtarma: " + (endTime - startTime));
    }
}




