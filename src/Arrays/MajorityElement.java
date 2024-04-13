package Arrays;

import java.util.*;

public class MajorityElement {

    public static void main(String[] args) {
        int arr[] = new int[]{4,1,3,3,3,3};
        int n = arr.length;


        System.out.println(majorityElement(arr, n));

    }

    public static int majorityElement(int a[], int size) {
       Map<String,Integer> intMap = new HashMap<String,Integer>();

       for(int i=0; i< size; i++){
           int count=0;

           if(intMap.containsKey(String.valueOf(a[i]))){
              count= intMap.get(String.valueOf(a[i]));
               intMap.put(String.valueOf(a[i]), count+1);
           }else{
               intMap.put(String.valueOf(a[i]), count+1);
           }
       }
        int maxOccur = Collections.max(intMap.values());
        int count = 0;
        int res = 0;
        for (Map.Entry<String, Integer> entry : intMap.entrySet()) {
            if (entry.getValue()==maxOccur) {
                res= Integer.parseInt(entry.getKey());
               count ++;
            }
        }
        if( maxOccur < size/2 || count>1){
            return -1;
        }else{
            return res;
        }

    }
}
