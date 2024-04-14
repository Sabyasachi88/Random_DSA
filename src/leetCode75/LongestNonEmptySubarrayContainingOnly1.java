package leetCode75;

public class LongestNonEmptySubarrayContainingOnly1 {

    public static void main(String args[]){
        System.out.print(longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
    }

    public static int longestSubarray(int[] nums){
        int end = 0;
        int start = 0;
        int k = 1;
        while (end <nums.length){
            if(nums[end] == 0){
                k--;
            }
            if(k < 0 && nums[start++] ==0){
                k++;
            }
            end++;
        }

        if((start) ==0){
            return nums.length -1;
        }
        return end - start -1;
    }
}
