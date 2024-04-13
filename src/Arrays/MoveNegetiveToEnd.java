package Arrays;

import java.util.*;

public class MoveNegetiveToEnd {

    public static void main(String[] args) {
        int arr[] = new int[]{-2, 10, -3, -4, 8};
        int n = arr.length;

        segregateElements(arr, n);

    }

    public static void segregateElements(int arr[], int n)
    {
        int temp[] = new int[n];

        // Traversal array and store +ve element in
        // temp array
        int j = 0; // index of temp

        for (int i = 0; i < n; i++)
            if (arr[i] >= 0)
                temp[j++] = arr[i];

        // If array contains all positive or all
        // negative.
        if (j == n || j == 0)
            return;

        // Store -ve element in temp array
        for (int i = 0; i < n; i++)
            if (arr[i] < 0)
                temp[j++] = arr[i];

        // Copy contents of temp[] to arr[]
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
        System.out.print(Arrays.toString(arr));


    }
}
