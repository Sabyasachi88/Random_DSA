package Maths;

public class
StringMultiply {


    public static void main(String[] args)
    {
          System.out.println(string_multi("-675356291270936062618792023759228973612931947845036106320615547656937452547443078688","3149206892664950487172722610615949091771159776736563948129390885096385611598481030444"));
        //System.out.println(string_multi("123","456"));

    }

    private static String string_multi(String a, String b){

        if(a.startsWith("0") || b.startsWith("0")) return "0";
        boolean is_negetive = false;
        int neg_len=0;
        if(a.startsWith("-") || b.startsWith("-")){
            is_negetive=true;
            a= a.replace("-","");
            b= b.replace("-","");
            neg_len=1;
        }

        int a_len = a.length();
        int b_len = b.length();
        int [] res = new int[a_len +b_len + neg_len];

        int i= b_len -1;
        int pf = 0;
        while(i>=0){
            int i_val = b.charAt(i) - '0';
            i--;
            int k = res.length - 1 - pf;
            int carry =0;
            int j= a_len - 1;

            while(j>=0 || carry !=0){
                int j_val = j>=0 ?a.charAt(j) - '0':0;
                j--;
                int product = i_val * j_val +carry + res[k];

                res[k] = product%10;
                carry = product/10;
                k--;

            }
            pf++;

        }
        //manage leading zeros
        boolean non_zero = false;
        String str = "";
        if(is_negetive){
            str+="-";
        }
        for(int r : res){
            if( r==0 && non_zero == false){

            }else{
                non_zero = true;
                str+= r;
            }
        }

        return str;
    }
}
