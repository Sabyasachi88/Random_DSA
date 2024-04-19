package leetCode75;

import java.util.*;

public class UniqueOccurrences {


    public static void main(String args[]){
        System.out.print(uniqueOccurrences(new int[]{1,2,3}));
    }


    public static  boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int number : arr) {
            countMap.merge(number, 1, Integer::sum);
        }
        Set<Integer> occurrenceSet = new HashSet<>(countMap.values());
        return occurrenceSet.size() == countMap.size();
    }
}
