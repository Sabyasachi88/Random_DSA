package Arrays;

import java.util.ArrayList;

public class MinMax {

    public static void main(String[] args) {
        int arr[] = new int[]{-4,1,3,3,2,5};
        int n = arr.length;
        System.out.print(findSum(arr,n));

    }

    public static int findSum(int A[],int N)
    {
        int min=0,max=0;
        for(int i=0; i<N;i++){
            if(A[i]<=min){
                min= A[i];
            }
            if(A[i]>=max){
                max= A[i];
            }
        }

        return max+min;
    }
}
