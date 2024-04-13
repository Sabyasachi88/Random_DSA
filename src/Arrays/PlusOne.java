package Arrays;

import java.util.ArrayList;

public class PlusOne {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(9);arr.add(9);
        int n = arr.size();
                increment(arr, n);

    }

    static ArrayList<Integer> increment(ArrayList<Integer> a , int n) {
        // code here


        // Add 1 to last digit and find carry
        a.set(n - 1, a.get(n - 1) + 1);
        int carry = a.get(n - 1) / 10;
        a.set(n - 1, a.get(n - 1) % 10);

        // Traverse from second last digit
        for (int i = n - 2; i >= 0; i--) {
            if (carry == 1) {
                a.set(i, a.get(i) + 1);
                carry = a.get(i) / 10;
                a.set(i, a.get(i) % 10);
            }
        }

        // If carry is 1, we need to add
        // a 1 at the beginning of vector
        if (carry == 1)
            a.add(0, 1);

        return a;
    }
}
