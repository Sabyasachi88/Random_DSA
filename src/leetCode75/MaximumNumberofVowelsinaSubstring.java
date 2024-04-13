package leetCode75;

public class MaximumNumberofVowelsinaSubstring {


    public static void main(String args [] ){
        System.out.print(maxVowels("bciiidef",3));
    }


    public static int maxVowels(String s, int k) {

        if (s.length() < k) return 0;
        int max = 0, n = s.length();
        int count = 0;
        for(int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))) count++;
        }
        max = count;

        for(int i = k; i < n; i++) {

            if(isVowel(s.charAt(i - k))){
                count--;
            }

            if(isVowel(s.charAt(i))) {
                count++;
            }

            max = Math.max(max, count);
        }
        return max;
    }

    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' | ch == 'o' || ch == 'u');
    }
}
