package leetCode75;

public class IsSubsequence {

    public static void main(String args[]){
        System.out.print(isSubsequence("abc", "ahbgdc"));
    }


    public static boolean isSubsequence(String s, String t) {
        int index=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            index=t.indexOf(c,index);
            if(index==-1) { return false; }
            index++;
        }
        return true;
    }
}
