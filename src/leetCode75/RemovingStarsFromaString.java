package leetCode75;

import java.util.HashMap;
import java.util.Map;

public class RemovingStarsFromaString {

    public static void main(String args[]){
        System.out.print(removeStars("leet**cod*e"));
    }


    public static String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (final char c : s.toCharArray())
            if (c == '*')
                sb.deleteCharAt(sb.length() - 1);
            else
                sb.append(c);
        return sb.toString();

    }
}
