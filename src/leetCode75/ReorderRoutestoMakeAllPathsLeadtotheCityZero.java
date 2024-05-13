package leetCode75;

import java.util.LinkedList;

public class ReorderRoutestoMakeAllPathsLeadtotheCityZero {


    public static void main(String args[]) {
        int arr[][] =  { {1,3}, {2,3},{4,0},{4,5},{0,1}};
        minReorder(6, arr);

    }

    public static int minReorder(int n, int[][] connections) {
        boolean[] visited = new boolean[n];
        LinkedList<int[]> queue = new LinkedList<>();

        int ret = 0;
        visited[0] = true;
        for(int[] conn : connections) {
            if(visited[conn[0]]) {
                visited[conn[1]] = true;
                ret++;
            } else if(visited[conn[1]]) {
                visited[conn[0]] = true;
            } else {
                queue.offerFirst(conn);
            }
        }

        while(!queue.isEmpty()) {
            int[] conn = queue.poll();
            if(visited[conn[0]]) {
                visited[conn[1]] = true;
                ret++;
            } else if(visited[conn[1]]) {
                visited[conn[0]] = true;
            } else {
                queue.offerLast(conn);
            }
        }
        return ret;
    }
}
