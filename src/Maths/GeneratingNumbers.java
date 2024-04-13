package Maths;

import java.io.*;
import java.util.*;
import java.math.*;

public class GeneratingNumbers {

    public static void main(String[] args)
    {

        generateNumbers(15);
    }

    static ArrayList<Long> generateNumbers(int N){

        ArrayList<Long> res = new ArrayList<>();
        TreeSet<Long> set = new TreeSet<>();
        set.add(1L);
        for(int i=0;i<N;i++) {
            long p = set.pollFirst();
            res.add(p);
            set.add(2 * p);
            set.add(3 * p);
            set.add(5 * p);
            set.add(7 * p);
        }
    return res;
    }
}
