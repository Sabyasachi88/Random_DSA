package Arrays;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MinSwap {

    public static void main(String[] args) {
        int[] A =
                new int[]{2,2,2,4,5};

        int[] B =
                new int[]{1,1,3,2,2};

        System.out.println(minSwaps(A.length,A,B));

    }


    static int minSwaps(int N, int A[], int B[]){
        int c1=0,c2=0,c3=0,c4=0;
        int a=A[0],b=B[0];

        for(int i=0;i<A.length;i++){
            //case1:= we try to make all top elem 2
            if(c1!=Integer.MAX_VALUE){
                if(A[i]==a){

                }else if(B[i]==a){
                    c1++;
                }else{
                    c1=Integer.MAX_VALUE;
                }
            }

//case2:==we try to make all bottom elem2
            if(c2!=Integer.MAX_VALUE){
                if(B[i]==a){

                }else if(A[i]==a){
                    c2++;
                }else{
                    c2=Integer.MAX_VALUE;
                }
            }

            //case3: try to make top elm 5
            if(c3!=Integer.MAX_VALUE){
                if(A[i]==b){

                }else if(B[i]==b){
                    c3++;
                }else{
                    c3=Integer.MAX_VALUE;
                }
            }

            //case 4 try to make all bottom elem 5
            if(c4!=Integer.MAX_VALUE){
                if(B[i]==b){

                }else if(A[i]==b){
                    c4++;
                }else{
                    c4=Integer.MAX_VALUE;
                }
            }

        }
//then return min amongs all ,if not possible
// return -1
        return Math.min(Math.min(c1,c2),Math.min(c3,c4))==Integer.MAX_VALUE?-1:Math.min(Math.min(c1,c2),Math.min(c3,c4));
    }


}
