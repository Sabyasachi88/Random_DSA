package leetCode75;

public class Maximum_Average_Subarray {

    public static void main(String args [] ){
        System.out.print(findMaxAverage(new int[]{1,12,-5,-6,50,3},4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int s = 0;
        for (int i = 0; i < k; ++i) {
            s += nums[i];
        }
        int ans = s;
        for (int i = k; i < nums.length; ++i) {
            s += (nums[i] - nums[i - k]);
            ans = Math.max(ans, s);
        }
        return ans * 1.0 / k;
    }

}
