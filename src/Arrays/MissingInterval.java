package Arrays;

import java.util.ArrayList;

public class MissingInterval {

    public static void main(String[] args) {
        int[] A =
                new int[]{1,4,5,10,100};


        System.out.println(printMissingIntervals(A, A.length));

    }

    static int[] printMissingIntervals(int[] a , int n){
        ArrayList<Integer> arr = new ArrayList<>();
        int start =0;
        int end =0;

        if(a[0]!=0) {
            start = 0;
            end = a[0]-1;
            arr.add(start);
            arr.add(end);
        }
        for(int i =1; i<n; i++) {
            if(a[i-1]+1 !=a[i]) {
                start = a[i-1]+1;
                end=a[i]-1;
                arr.add(start);
                arr.add(end);
            }
        }
        if(a[n-1]+1<=99999) {
            start=a[n-1]+1;
            end=99999;
            arr.add(start);
            arr.add(end);
        }
        int[] temp = new int[arr.size()];

        for(int i = 0; i<arr.size(); i++)
            temp[i] = arr.get(i);
        return temp;


    }
}
