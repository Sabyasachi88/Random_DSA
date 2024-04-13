package leetCode75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Max_Number_of_K_Sum_Pairs {
    public static void main(String args [] ){
        System.out.print(maxOperations(new int[]{3,1,3,4,3},6));
    }


    public static int maxOperations(int[] nums, int target) {
        int n = 0;
        for (int num: nums) {
            if (num < target) {
                nums[n++] = num;
            }
        }
        Arrays.sort(nums, 0, n);
        int res = 0, left = 0, right = n - 1;
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                res++;
                left++;
                right--;
                continue;
            }
            if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
