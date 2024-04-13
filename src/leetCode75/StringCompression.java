package leetCode75;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    public static void main(String args[]){
       // System.out.print(compress(new char[]{"a","a","b","b","c","c","c"}));
    }

    public static int compress(char[] chars) {
        int total_count = 0;
        char current_char = chars[0];
        int occurrence = 0;
        int index = 0;
        for(char ch : chars){
            if(ch == current_char) occurrence++;
            else{
                if(occurrence > 1){
                    String str = Integer.toString(occurrence);
                    chars[index++] = current_char;
                    total_count++;
                    total_count += str.length();
                    for(char c : str.toCharArray()) chars[index++] = c;

                }
                else{
                    total_count++;
                    chars[index++] = current_char;
                }
                current_char = ch;
                occurrence = 1;
            }
        }
        if(occurrence > 1){
            total_count++;
            chars[index++] = current_char;
            String str = Integer.toString(occurrence);
            total_count += str.length();
            for(char c : str.toCharArray()) chars[index++] = c;
        }
        else{
            total_count++;
            chars[index++] = current_char;
        }
        return total_count;
    }
}