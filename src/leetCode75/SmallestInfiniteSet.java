package leetCode75;

import java.util.TreeSet;

class SmallestInfiniteSet {
    private TreeSet<Integer> set;
    public SmallestInfiniteSet() {
        set = new TreeSet<>();
    }

    public int popSmallest() {
        int removed = set.isEmpty() ? null : set.first();
        if(!set.isEmpty()){
            set.pollFirst();
        }
        return removed;
    }

    public void addBack(int num) {
        if (!set.contains(num)) {
            set.add(num);
            // System.out.println(num + " was added to the set.");
        } else {
            // System.out.println(num + " already exists in the set.");
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
