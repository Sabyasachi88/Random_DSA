package leetCode75;

public class IncreasingTripletSubsequence {

    public static void main(String args[]){
        System.out.print(increasingTriplet(new int[]{20,100,10,12,5,13}));
    }

    public static boolean increasingTriplet(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;

        for (int num : nums) {

            if (num > middle) {
                return true;
            }

            if (num <= smallest) {
                smallest = num;
            } else {
                middle = num;
            }
        }

        return false;
    }
}
