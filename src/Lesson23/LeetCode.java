package Lesson23;

public class LeetCode {


    public static void main(String[] args) {


        int[] prices = {7, 1, 5, 3, 6, 4};

        int profit = 0;
        int first = prices[0];




        for (int j = 1; j < prices.length; j++) {

            if (first>prices[j]){
                first=prices[j];
            }

            else if (prices[j] - first > profit) {
                profit = prices[j] - first;
            }
        }

        System.out.println(profit);

    }

}
