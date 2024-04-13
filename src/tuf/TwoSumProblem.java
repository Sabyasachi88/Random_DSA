package tuf;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static int[] twoSum(int[] nums, int target) {

        int[] res = new int[]{0,0};
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int num=0;num<nums.length;num++){
            if(mp.containsKey(target - nums[num])){
                res[0] = mp.get(target - nums[num]);
                res[1] = nums[num];
            }else{
                mp.put(nums[num], num);
            }
        }

        return res;
    }

    public static void main(String args [] ){
        System.out.print(twoSum(new int[]{2,7,11,15},9));
    }

}
