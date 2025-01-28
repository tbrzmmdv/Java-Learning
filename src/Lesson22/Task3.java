package Lesson22;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Task3 {
    public static void main(String[] args) {

        Queue<String> task = new LinkedList<>();
        task.add("Lazimsiz");
        task.add("Vacib");
        task.add("Orta");   

        while (!task.isEmpty()) {
            System.out.println(task.poll());
        }


        PriorityQueue<String> priority = new PriorityQueue<>(Comparator.reverseOrder());


        priority.add("Lazimsiz");
        priority.add("Vacib");
        priority.add("Orta");

        System.out.println("**************************************************");
        while (!priority.isEmpty()) {
            System.out.println(priority.poll());
        }
    }
}
