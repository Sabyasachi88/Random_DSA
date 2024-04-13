package Arrays;

public class MaxDistance {

    public static void main(String[] args) {
        int[] A =
                new int[]{1,0,0,0,1,0,1};


        System.out.println(maxDistance(A, A.length));

    }

    public static int maxDistance(int[] A, int N) {

        if(N ==0 || A ==null) {
            return 0;
        }

        int result = 0;
        int pos = 0;

        for(int i=0;i<N;i++){
            if(A[i]==1){
                pos=0;
            }else{
                pos++;
                result = Math.max(result,(pos +1)/2);
            }
        }

        for(int i=0;i<N;i++){
            if(A[i]==1){
                result = Math.max(result, i);
                break;
            }
        }

        for(int i=N-1;i>=0;i--){
            if(A[i]==1){
                result = Math.max(result, N-1 -i);
                break;
            }
        }

        return result;

    }
}
