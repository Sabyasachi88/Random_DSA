package tuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;


class Interval {
    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getFinish() {
        return finish;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }

    int start,  finish;

    Interval(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}
public class OverlapingIntervals {
    static List < Interval > merge(List < Interval > intervals) {

        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval o1, Interval o2) {
                return ((Integer)o1.start)- (Integer) o2.start;
            }
        });

        List < Interval > merged= new ArrayList<Interval>();

        for (int i = 0; i < intervals.size(); i++) {
            Interval interval = new Interval(0,0);
            if (merged.isEmpty() || merged.get(merged.size() - 1).finish < intervals.get(i).start) {

                interval.setStart(intervals.get(i).start);
                interval.setFinish(intervals.get(i).finish);

                merged.add(interval);
            } else {

                //merged.get(merged.size() - 1).setStart((interval.getStart()));
                merged.get(merged.size() - 1).setFinish(Math.max((intervals.get(i).finish),merged.get(merged.size() - 1).finish));
            }
        }

        return merged;
    }

    public static void main(String args[]) {
        List< Interval > arr = new ArrayList< >();
        arr.add(new Interval(1,3));
        arr.add(new Interval(2,4));
        arr.add(new Interval(2,6));
        arr.add(new Interval(8,9));
        arr.add(new Interval(8,10));
        arr.add(new Interval(9,11));
        arr.add(new Interval(15,18));
        arr.add(new Interval(16,17));
       List < Interval > ans = merge(arr);
        System.out.println("Merged Overlapping Intervals are ");
        for (Interval it: ans) {
            System.out.println(it.getStart() + " " + it.getFinish());
        }
    }
}
