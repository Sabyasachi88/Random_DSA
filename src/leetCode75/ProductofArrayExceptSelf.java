package leetCode75;

public class ProductofArrayExceptSelf {

    public static void main(String args[]){
        System.out.print(productExceptSelf(new int[]{1,2,3,4}));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        for(int i = 1; i < nums.length; i++){
            left[i] = left[i - 1] * nums[i - 1];
        }
        int right = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            right *= nums[i + 1];
            left[i] *= right;
        }
        return left;


    }
}
