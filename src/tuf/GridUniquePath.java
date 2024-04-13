package tuf;

public class GridUniquePath {

    public static int uniquePaths(int m, int n){

        int N = m  + n -2;
        int R = m-1;
        double res = 1;

        for(int i=1;i<= R;i++){
            res = res * (N -R +i)/i;
        }
        return (int)res;

    }

    public static void main(String args[] ){
        System.out.print(uniquePaths(23,12));
    }
}
