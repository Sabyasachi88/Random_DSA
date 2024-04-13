package leetCode75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KidsWithTheGreatestNumberofCandies {

    public static void main(String args[]){
        System.out.print(kidsWithCandies(new int[]{2,3,5,1,3,100},3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i= 0;
        List<Boolean> result = new ArrayList<Boolean>();
        int maxCandies = 0;

        for (int k = 0; k < candies.length; k++) {
            maxCandies = Math.max(candies[k],maxCandies);
        }

        while(i< candies.length){
            maxCandies = Math.max(candies[i],maxCandies);
            result.add(candies[i]+ extraCandies >= maxCandies);
            i++;
        }

        return result;
    }

}
