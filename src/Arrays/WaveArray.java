package Arrays;

public class
WaveArray {
    public static void main(String[] args)
    { int arr[] =new int[]{1,2,3,4,5,6};
        int n = arr.length;

        convertToWave(n,arr);
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");

    }

    public static void convertToWave(int n, int[] arr) {


        int i = 0;

        while(i+2<=n){
            int base = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = base;
            i+=2;
        }

    }

}
