package leetCode75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EqualRowandColumnPairs {

    public static void main(String args[]){
        System.out.print(equalPairs(new int[][]{{3,2,1},{1,7,6},{2,7,7}}));
    }


    public static int equalPairs(int[][] grid) {
        int pairs = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int row = 0;row<grid.length;row++){
            int key = getRowHash(grid,row);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(int col = 0;col<grid.length;col++){
            int key = getColumnHash(grid,col);
            int value = map.getOrDefault(key,-1);
            if(value!=-1){
                pairs+=value;
            }
        }

        return pairs;
    }
    private static int getRowHash(int[][] grid, int r) {
        int result = 0;
        for(int i=0; i<grid.length; i++) {
            result = grid[r][i] + 7 * result;
        }
        return result;
    }
    private static int getColumnHash(int[][] grid, int c) {
        int result = 0;
        for(int i=0; i<grid.length; i++) {
            result = grid[i][c] + 7 * result;
        }
        return result;
    }
}
