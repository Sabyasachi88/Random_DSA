package Arrays;

public class PivotIndex {

    public static void main(String[] args) {

        int[] arr =
                new int[]{1, 7,3,6,5,6};

       System.out.print(pivotIndex(arr));



    }
    public static int pivotIndex(int[] nums) {
        int pivot= (nums.length/2)+1;
        int leftSum= 0,rightSum = 0;
        while(pivot>0 & pivot<nums.length) {
            for (int start = 0, end = nums.length-1; start < pivot & pivot < end; start++, end--) {
                leftSum += nums[start];
                rightSum += nums[end];
            }
           if(leftSum<rightSum){
               pivot++;
           }else{
               pivot--;
           }
        }
    return pivot;
    }
}
