package Lesson27;

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];
        int check = 1;
        for (int i : nums) {
            check *= i;
        }

        for (int j = 0; j < nums.length; j++) {
            ans[j] = check / nums[j];

        }
        return ans;
    }
}

