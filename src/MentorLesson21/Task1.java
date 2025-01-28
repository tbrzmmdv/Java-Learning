package MentorLesson21;

import java.util.*;

public class Task1 {


    public static void main(String[] args) {


        //coxlu deyer ucun asList,tek deyer ucun ListOf
        HashMap<Integer,List<String>> ageAndNames=new HashMap<>();
        ageAndNames.put(12,new ArrayList<>(List.of("Tebriz")));
        ageAndNames.put(13,new ArrayList<>(List.of("Akula")));
        ageAndNames.put(14,new ArrayList<>(List.of("Messi")));
        ageAndNames.put(16,new ArrayList<>(List.of("Lionel")));
        ageAndNames.put(166,new ArrayList<>(List.of("DeJong")));


        for (Map.Entry<Integer,List<String>> entry : ageAndNames.entrySet()){
            System.out.println("Age:"+entry.getKey()+" Name:"+entry.getValue());
        }







    }
}
