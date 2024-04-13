package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxForK {

    public static void main(String[] args) {
        int[] arr =
                new int[]{1, 2, 4, 4,4,4,4,4,4,5,6,7,8,9,10};

        System.out.println(maxValueK(arr));

    }


    public static int maxValueK(int[] arr) {

        // To store freq.
        int[] freq = new int[arr.length + 1];

        // Filling freq vector.
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] < arr.length)
                freq[arr[i]]++;
            else
                freq[arr.length]++;
        }

        int total = 0;

        // Finding K number.
        for(int i = arr.length; i >= 0; i--)
        {
            total += freq[i];
            if (total >= i)
                return i;
        }

        // No K number found.
        return 0;

    }
}
