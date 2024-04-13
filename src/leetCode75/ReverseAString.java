package leetCode75;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReverseAString {

    public static void main(String args[]){
        System.out.print(reverseWords(" a good   example "));
    }


    public static String reverseWords(String s) {

       Pattern p = Pattern.compile("\\s+");
       String[] temp = p.split(s.strip());
       String res = "";

        int start = 0;
        int end = temp.length- 1;

        while(start < end){
            String t = temp[start];
            temp[start] = temp[end];
            temp[end] = t;

            start++;
            end--;
        }
        return Arrays.stream(temp).collect(Collectors.joining(" "));
    }
}
