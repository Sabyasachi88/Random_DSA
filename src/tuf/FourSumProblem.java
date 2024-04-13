package tuf;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumProblem {

    public static List<List<Integer>> fourSum(int[] num, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();

        if (num == null || num.length <= 3)
            return res;
        if(num.length ==4){
            long sum = 0;
            for(int ele : num){
                sum +=  ele;
            }
            if(target == sum){
                List<Integer> quad = new ArrayList<>();
                for(int ele : num){
                    quad.add(ele);
                }
                res.add(quad);
                return res;
            }
        }

        int n = num.length;
        Arrays.sort(num);

        for (int i = 0; i < n; i++) {

            int target_3 = target - num[i];

            for (int j = i + 1; j < n; j++) {

                int target_2 = target_3 - num[j];

                int front = j + 1;
                int back = n - 1;

                while(front < back) {

                    int two_sum = num[front] + num[back];

                    if (two_sum < target_2) front++;

                    else if (two_sum > target_2) back--;

                    else {

                        List<Integer> quad = new ArrayList<>();
                        quad.add(num[i]);
                        quad.add(num[j]);
                        quad.add(num[front]);
                        quad.add(num[back]);
                        res.add(quad);

                        // Processing the duplicates of number 3
                        while (front < back && num[front] == quad.get(2)) ++front;

                        // Processing the duplicates of number 4
                        while (front < back && num[back] == quad.get(3)) --back;

                    }
                }

                // Processing the duplicates of number 2
                while(j + 1 < n && num[j + 1] == num[j]) ++j;
            }

            // Processing the duplicates of number 1
            while (i + 1 < n && num[i + 1] == num[i]) ++i;

        }


        return res;
    }

    public static void main (String[] args) {
        int arr[] = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        List<List<Integer>> ls = fourSum(arr, target);
        //System.out.println("raj");
        for(int i = 0;i<ls.size();i++) {
            for(int j = 0;j<ls.get(i).size();j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
