package Maths;

public class CalculateSum {

    public static void main(String[] args)
    {
        System.out.println(calculateSum(6,2,2));
    }


    private static long calculateSum(int n,int a, int b) {

        if(a==1 || b==1)
            return (long)n*(n+1)/2;

        if(a==b){

            if(b==n)
                return n;

            long A = n/a;
            return (long)A*(2*a + (A-1)*a)/2;
        }

        long A = n/a;
        long B = n/b;
        long sumForA = (long) A*(2*a + (A-1)*a)/2;
        long sumForB = (long) B*(2*b + (B-1)*b)/2;

        long c = lcm(a,b); //took lcm of a,b instead of multiplying them
        long C = n/c;
        long sumForC =  C*(2*c + (C-1)*c)/2;

        return sumForA-sumForC+sumForB;
    }

    private static long gcd(long a, long b){
        while(b%a != 0){
            long remainder = b % a;
            b = a;
            a = remainder;
        }
        return a;
    }

    private static long lcm(long a, long b){
        return a*b / gcd(a,b);
    }
}
