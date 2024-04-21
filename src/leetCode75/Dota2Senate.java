package leetCode75;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Dota2Senate {


    public static void main(String args[]){
        System.out.print(predictPartyVictory("RDD"));
    }


    public static String predictPartyVictory(String senate) {
        Queue<Integer> radient = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();


        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                radient.add(i);
            } else {
                dire.add(i);
            }
        }
        while (!radient.isEmpty() && !dire.isEmpty()) {
            int r = radient.poll();
            int d = dire.poll();

            if (r < d) {
                radient.add(senate.length() + r);
            } else {
                dire.add(senate.length() + d);
            }
        }
        return (radient.size() > dire.size())? "Radient":"Dire";
    }
}
