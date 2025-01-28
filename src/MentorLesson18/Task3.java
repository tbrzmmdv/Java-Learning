package MentorLesson18;

import java.util.HashSet;

public class Task3 {


    static HashSet<String> hashSet=new HashSet<>();

    public static void main(String[] args) {
        hashSet.add("Akula");
        hashSet.add("Baliq");
        hashSet.add("Messi");
        hashSet.add("Akula");

        for (String s:hashSet){
            System.out.println(s);
        }

    }


}
