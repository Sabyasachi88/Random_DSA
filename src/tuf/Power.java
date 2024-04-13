package tuf;

public class Power {

    public static void main(String args[])
    {
        System.out.println(myPow(2.0000,-2147483648));
    }

    public static double myPow(double x, int n) {
        double ans = 1;
        long nn = n;
        if (n < 0) {
            nn *=-1;
        }
        while (nn > 0) {
            if (nn % 2 == 0) {
                x = x * x;
                nn = nn / 2;
            } else {
                ans = ans * x;
                nn = nn - 1;
            }

        }
        if(n<0) {
            ans = 1/ans;
        }
        return ans;
    }
}
