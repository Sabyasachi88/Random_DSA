package leetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindtheDifferenceofTwoArrays {


    public static void main(String args[]){
        System.out.print(findDifference(new int[]{1,2,3}, new int[]{2,4,6}));
    }


    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2){
        return Arrays.asList(commonElemnts(nums1,nums2), commonElemnts(nums2,nums1));
    }

    public static List<Integer> commonElemnts(int[] nums1, int[] nums2) {
        HashSet a = new HashSet<>();
        HashSet b = new HashSet<>();

        for (int i : nums2) {
            b.add(i);
        }
        for (int j : nums1){
            if(!b.contains(j)){
                a.add(j);
            }
        }

        return new ArrayList<Integer>(a);
    }
}
