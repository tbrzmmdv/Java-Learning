package MentorLesson21;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {

        String input ="Lionel Messi";
        Map<Character,Integer> charAndInteger=new HashMap<>();


        for (char c:input.toCharArray()){
            if (c !=' '){
                if (charAndInteger.containsKey(c)) {
                    charAndInteger.put(c, charAndInteger.get(c) + 1);
                } else {
                    charAndInteger.put(c, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : charAndInteger.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }





    }
}
