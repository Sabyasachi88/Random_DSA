package leetCode75;

public class MaximumNumberOfConsecutive {

    public static void main(String args[]){
        System.out.print(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }

    public static int longestOnes(int[] nums, int k) {
        int end = 0;
        int start = 0;

        while (end <nums.length){
            if(nums[end] == 0){
                k--;
            }
            if(k < 0 && nums[start++] ==0){
                k++;
            }
            end++;
        }
        return end - start;
    }
}
