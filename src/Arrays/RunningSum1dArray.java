package Arrays;

public class RunningSum1dArray {

    public static void main(String[] args) {
        int[] arr =
                new int[]{1, 2, 4, 4,4,4,4,4,4,5,6,7,8,9,10};

        int[] result =  runningSum(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+",");
        }


    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}
