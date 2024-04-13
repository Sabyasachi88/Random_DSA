package tuf;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int[] A =
                new int[]{1,0,0,0,1,0,1};

        printPascal(5);

    }

    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
        ArrayList<ArrayList<Long>> res = new ArrayList<>();
        ArrayList<Long> row, pre = null;
        for (int i = 0; i < n; ++i) {
            row = new ArrayList<Long>();
            for (int j = 0; j <= i; ++j)
                if (j == 0 || j == i)
                    row.add(1L);
                else
                    row.add(pre.get(j - 1) + pre.get(j));
            pre = row;
            res.add(row);
        }
        return res;
    }
}
