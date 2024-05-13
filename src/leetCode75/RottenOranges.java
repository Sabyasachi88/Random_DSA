package leetCode75;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {


    public static void main(String args[]){
        // System.out.print(compress(new char[]{"a","a","b","b","c","c","c"}));
        int arr[][] =  {{0,1}};

        System.out.print(orangesRotting(arr));
    }

    public static int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<PairO> q= new LinkedList<PairO>();
        int[][] vis = new int[n][m];

        int cntFresh = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    q.add(new PairO(i,j,0));
                    vis[i][j]=2;
                }else{
                    vis[i][j]=0;
                }
                if(grid[i][i] == 1){
                    cntFresh ++;
                }
            }

        }

        int tm = 0;
        int[] dRow = {-1,0,1,0};
        int[] dCol = {0,1,0,-1};

        int cnt = 0;

        while(!q.isEmpty()){

            int rRow = q.peek().row;
            int rCol = q.peek().col;
            int rTime = q.peek().time;
            tm = Math.max(tm, rTime);
            q.remove();

            for(int i=0;i<4;i++){
                int nRow = rRow + dRow[i];
                int nCol = rCol + dCol[i];

                if(nRow >= 0 && nRow < n && nCol >=0 && nCol < m &&
                        vis[nRow][nCol] ==0 &&
                        grid[nRow][nCol] ==1){

                    vis[nRow][nCol] = 2;
                    q.add(new PairO(nRow, nCol, rTime + 1));
                    cnt++;

                }
            }
        }

        if(cnt != cntFresh){
            return -1;
        }

        return tm;


    }
}


class PairO{
    int row;
    int col;
    int time;

    PairO(int _row,  int _col, int _time){
        this.row = _row; this.col = _col; this.time = _time;
    }
}
