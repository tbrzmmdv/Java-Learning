package MentorLesson16;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String word=scanner.nextLine();
        System.out.println(word.length());
        System.out.println(word.substring(0, 3));
        System.out.println(word.toUpperCase());
        System.out.println(word.startsWith("mss"));

    }

}
