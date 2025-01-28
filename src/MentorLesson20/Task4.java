package MentorLesson20;

import java.util.SortedMap;
import java.util.TreeMap;

public class Task4 {

    public static void main(String[] args) {
        SortedMap<Integer,String> sortedMap=new TreeMap<>();

        sortedMap.put(12,"Messi");
        sortedMap.put(27,"Messi");
        sortedMap.put(16,"Messi");
        sortedMap.put(1,"Messi");


        System.out.println(sortedMap.subMap(1, 20));


    }
}
