package leetCode75;

import java.util.LinkedList;
import java.util.Queue;

public class NearerstExit {


    public static void main(String args[]){
        // System.out.print(compress(new char[]{"a","a","b","b","c","c","c"}));
        char arr[][] =  {{'+','+','+'},{'.','.','.'},{'+','+','+'}};
        int[] entrance = {1,0};

        System.out.print(nearestExit( arr, entrance));
    }


    public static int nearestExit(char[][] maze, int[] entrance) {

        int n = maze.length;
        int m = maze[0].length;

        int[] dRow = {-1,0,1,0};
        int[] dCol = {0,1,0,-1};

        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(entrance[0],entrance[1],0));

        boolean [][] vis = new boolean[n][m];
        vis[entrance[0]][entrance[1]] = true;

        while(!q.isEmpty()){

            int r= q.peek().row;
            int c= q.peek().col;
            int dist= q.peek().dist;
            q.remove();

            for(int i=0;i<4;i++){
                int nr= r+ dRow[i];
                int nc= c+ dCol[i];

                if(nr >= 0 && nr < n && nc >=0 && nc < m && maze[nr][nc] == '.' && !vis[nr][nc]){
                    if(nr == 0  || nc == 0 || nr == n-1 || nc == m-1){

                        return dist + 1;
                    }
                    maze[r][c] = '+';
                    q.add(new Pair(nr, nc, dist +1));
                    vis[nr][nc] = true;

                }

            }

        }
        return -1;

    }
}


