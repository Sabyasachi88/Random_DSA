package tuf;

public class MoorsVotingAlgo {

    public static int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        for(int num : nums){
            if(count == 0){
                element = num;
            }
            if(element == num){
                count += 1;
            }else{
                count-=1;
            }
        }

        return element;
    }

    public static void main(String [] args){
        System.out.print(majorityElement(new int[]{4,4,2,4,3,4,4,3,2,4}));
    }
}
