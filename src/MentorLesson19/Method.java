package MentorLesson19;

import java.util.ArrayList;
import java.util.List;

public class Method {

    public static <T> void printArray(List<T> array){

        for (T value:array){
            System.out.println(value);
        }
    }


    public static void main(String[] args) {

        List<Integer> integers=new ArrayList<>();
        List<String> strings=new ArrayList<>();
        integers.add(12);
        strings.add("As");

        printArray(integers);
        printArray(strings);











    }










}
