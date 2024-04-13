package tuf;

public class CountInversions {

    public static void main (String [] args){
        int arr[]={5,3,2,1,4};
        int n=5;
        int temp[] = new int[arr.length];
        System.out.println("Given Array");
        printArray(arr);
        int ans = sort(arr,temp,0,n-1);
        System.out.println("\nSorted array");
        printArray(arr);
        System.out.println("\nInversion Count");
        System.out.println(ans);
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static int sort(int[] arr, int[] temp, int l, int r){
        int invert_count=0, m=0;
        if(r>l){
            m= (l+r)/2;
            invert_count += sort(arr, temp,l,m);
            invert_count += sort(arr, temp,m+1,r);
            invert_count +=  merge(arr, temp,l,m+1,r);
        }
        return invert_count;
    }

    static int merge(int[] arr, int []temp,int l,int  m,int r){
        int invert_count=0;

        int i=l,j=m,k=l;
        while(i<=m-1 && j<=r){
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
                invert_count += m-1;
            }
        }
        while(i<= m-1){
            temp[k++] = arr[i++];
        }
        while(j<= r){
            temp[k++] = arr[j++];
        }
        for(i = l ; i <= r ; i++)
            arr[i] = temp[i];
        return invert_count;
    }
}
