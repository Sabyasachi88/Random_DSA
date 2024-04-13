package Maths;

public class
FindNthNumber {

    public static void main(String[] args)
    {

        System.out.println(findNth(15, 8));
    }

    private static long findNth(long limit, long base) {
        long alpha=0, beta=1;
        while( limit > 0 ) {
            alpha += (beta * (limit % base));
            limit/=base;
            beta*=10;
        }
        return alpha;
    }

}
