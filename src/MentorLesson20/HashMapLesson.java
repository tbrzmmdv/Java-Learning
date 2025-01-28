package MentorLesson20;

import java.util.HashMap;

public class HashMapLesson {




    public static void main(String[] args) {
        HashMap<String,Integer> person=new HashMap<>();
        HashMap<String,Integer> person2=new HashMap<>();

        person.put("Tebriz",16);
        person.put("Tural",12);
        person.put("Messi",124);
        person.put("Baku",442);
        person.put("Akula",33);
        person.put("zayn",212);

        person2.put("Asas",16);
        person2.put("Turdadal",12);
        person2.put("Meffessi",124);
        person2.put("Aqdqkula",33);
        person2.put("zay123n",212);

        HashMap<String,Integer> both=new HashMap<>(person);

        both.putAll(person2);

        System.out.println(both);




    }
}
