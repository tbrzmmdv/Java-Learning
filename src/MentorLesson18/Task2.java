package MentorLesson18;

import java.util.PriorityQueue;
import java.util.Queue;

public class Task2 {

    static PriorityQueue<String> months=new PriorityQueue<>();

    public static void main(String[] args) {

        months.add("January");
        months.add("Feburary");
        months.add("December");


        for (String string:months){
            System.out.println(string);
        }

    }

}
