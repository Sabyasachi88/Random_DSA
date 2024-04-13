package tuf;

import java.util.ArrayList;

public class SearchIn2DArray {

    public static void main (String [] args){
        int arr[][]=new int [][]{{1,2,3},{4,5,6},{7,9,17}};
        System.out.print(searchMatrix(arr,9));
    }
    public  static boolean  searchMatrix(int[][] matrix, int target) {
        int lo = 0;
        if(matrix.length == 0) return false;
        int n = matrix.length;
        int m = matrix[0].length;
        int hi = (n * m) - 1;

        while(lo <= hi) {
            int mid = (lo + (hi - lo) / 2);
            if(matrix[mid/m][mid % m] == target) {
                return true;
            }
            if(matrix[mid/m][mid % m] < target) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return false;
    }
}
