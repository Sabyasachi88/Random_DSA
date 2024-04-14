package leetCode75;

import java.util.Arrays;

public class FindPivotIndex {


    public static void main(String args[]){
        System.out.print(pivotIndex(new int[]{1,2,3}));
    }


    public static int pivotIndex(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        int leftSum = 0;
         for(int i=0;i< nums.length;i++){
             if((totalSum - leftSum - nums[i]) == leftSum){
                return i;
             }
             leftSum +=nums[i];
         }
        return -1;

    }
}
