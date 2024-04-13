package tuf;

import java.util.ArrayList;
import java.util.HashSet;

public class MoorsVotingAlgo2 {

    public static ArrayList< Integer > majorityElement(int[] nums) {
        int num1=-1, num2=-1,count1=0,count2=0;
        for(int ele : nums){
            if(num1==ele){
                count1++;
            }else if(num2==ele){
                count2++;
            }else if(count1==0){
                num1 = ele;
                count1 =1;
            }else if(count2==0){
                num2 = ele;
                count2 =1;
            }else{
                count1--;
                count2--;
            }
        }

        count1 =count2 =0;
        int floor = nums.length/3;
        for(int ele : nums){
            if(num1 == ele){
                count1++;
            }
            if(num2 == ele){
                count2++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(count1 >= floor){
            ans.add(num1);
        }if(count2 >= floor){
            ans.add(num2);
        }

        return ans;

    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 3, 2,3,3};
        ArrayList < Integer > majority = majorityElement(arr);
        System.out.print("The majority element is: ");
        HashSet < Integer > s = new HashSet< >(majority);
        for (int it: s) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
}
