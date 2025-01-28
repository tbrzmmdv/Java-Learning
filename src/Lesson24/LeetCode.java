package Lesson24;

import java.util.HashSet;
import java.util.Set;

public class LeetCode {

    public static void main(String[] args) {

    }

        public boolean containsDuplicate() {
            int[] nums={1,2,3,4,1};


            Set<Integer> numbers=new HashSet<>();

            for (int i:nums){
                if (numbers.contains(i)){
                    return true;
                }
                numbers.add(i);
            }

            return false;
        }

}
