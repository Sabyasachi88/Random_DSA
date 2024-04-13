package tuf;

import java.util.ArrayList;

public class KadanaAlgo {

    public static void main(String args[])
    {
        int arr[]={-7 -8 -16 -4 -8 -5 -7 -11 -10 -12 -4 -6 -4 -16 -10 };
        ArrayList<Integer> subarray=new ArrayList<>();
        long lon=maxSubarraySum(arr,subarray);
        System.out.println("The longest subarray with maximum sum is "+lon);
        System.out.println("The subarray is ");
        for(int i=subarray.get(0);i<=subarray.get(1);i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    public static long maxSubarraySum(int[] nums,  ArrayList<Integer> subarray) {
        // write your code here


        int max=nums[0] , sum=0 ;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max)
            {

                max=sum;


            }
            if(sum<0)
            {
                sum=0;


            }
        }

        return max;
    }
}
