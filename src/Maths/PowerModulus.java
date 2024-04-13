package Maths;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class PowerModulus {


    public static void main(String[] args) {
        System.out.println(power_mod(18, 17, 2));
    }

    private static long power_mod(long base, long power, long modulus) {
        long res = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                res = (res * base) % modulus;
                power--;
            } else {
                base = (base * base) % modulus;
                power = power / 2;
            }
        }
        return res;
    }

}
