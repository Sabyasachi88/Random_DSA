package Maths;


public class ReverseNumber {

    public static void main(String[] args)
    {
        reverse_num(12345);
    }

    private static void reverse_num(long num){
        while(num!=0){
            System.out.print(num%10);
            num/=10;
        }
    }
}
