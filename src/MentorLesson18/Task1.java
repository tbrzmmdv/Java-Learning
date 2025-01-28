package MentorLesson18;

import java.util.ArrayList;

public class Task1 {


   static ArrayList<String> cities=new ArrayList<>();

    public static void main(String[] args) {
        cities.add("Tokyo");
        cities.add("Baku");
        cities.add("Brazil");

        cities.remove("Baku");


        for (String city:cities){
            System.out.println(city);


        }
        System.out.println(cities.get(1));
    }
}
