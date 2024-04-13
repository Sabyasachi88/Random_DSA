package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

    private static String StringUtils;

    public static void main(String[] args) {

       //System.out.println(Math.pow(2,3));
             // System.out.println(NthRoot(9, 1953125));

    }

    public static int singleNonDuplicate(int[] nums) {
        int  size = nums.length;

        if(size == 1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[size-1] != nums[size-2]){
            return nums[size-1];
        }

        int low= 1;
        int high = size-2;


        while(low <= high){
            int mid  = (low+high)/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }

            if((nums[mid] % 2 == 1 && nums[mid] == nums[mid-1]) || (nums[mid] % 2 ==0 && nums[mid] == nums[mid +1])){
                low = mid + 1;
            }else {
                high = mid - 1;
            }

        }
    return -1;
    }

    public static int NthRoot(int n, int m) {
        // Write your code here.

        int low= 1;
        int high = m;

        while(low <= high){
            int mid = (high+low)/2;
            int value = Integer.parseInt(nThPower(mid, n, m)+"");
            if( value == 1){
                return mid;
            }else if(value == 2 ){
                high = mid -1;
            }else if(value == 0){
                low = mid +1;
            }
        }

        return -1;
    }
    public static int nThPower(int mid, int power, int number){
        double value= 1;
        for(int i = 1; i<=power; i++){
            value *= mid ;

            if(value > number){
                return 2;
            }
        }
        if(value == number){
            return 1;
        }

        return 0;
    }


        public static String multiply(String a, String b) {

            if(a.equals("0") || b.equals("0")) return "0";
            boolean single_negetive = false;
            boolean both_negetive = false;
            int neg_len=0;
            if(a.startsWith("-") && b.startsWith("-")){
                both_negetive = true;
                neg_len=1;
                a= a.replace("-","");
                b= b.replace("-","");
            }
            if(a.startsWith("-") || b.startsWith("-")){
                single_negetive=true;
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
            if(single_negetive){
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
