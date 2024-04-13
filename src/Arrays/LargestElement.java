package Arrays;

import java.util.Arrays;

public class LargestElement {

    public static void main(String[] args)
    {
        System.out.println(kLargest(new int[]{1, 23, 12, 9, 30, 2, 50},7,2));
    }

    private static int[] kLargest(int[] arr, int n, int k) {
        int[] res = new int[k];

        Arrays.sort(arr);

        for(int i=0; i<k;i++){
            res[i] = arr[n -1 - i];
        }
        return res;
    }
}
