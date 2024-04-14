package leetCode75;

public class FindtheHighestAltitude {

    public static void main(String args[]){
        System.out.print(largestAltitude(new int[]{-5,1,5,0,-7}));
    }

    public static int largestAltitude(int[] gain) {
// 0,-5,-4,1,1,-6
        int g = 0;
        int index = 0;
        int ans = 0;
        while(index <gain.length){
            g +=gain[index];
            ans = Math.max(ans,g);
            index++;
        }
        return ans;
    }
}
