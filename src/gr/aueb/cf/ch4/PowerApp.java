package gr.aueb.cf.ch4;

import java.math.BigInteger;

/**
 * Calculates a^n.
 * e.g 2^10 = 1024
 */
public class PowerApp {
    public static void main(String[] args) {
        BigInteger bigResult = new BigInteger("1");
        int base = 2;
        int power = 10;
        int result = 1;

        for ( int i = 1; i <= power; i++) {
            result = result * base;
            bigResult = bigResult.multiply(BigInteger.valueOf(base)); // Για Μεγαλους αριθμους που δε χωρούν σε int
        }

        System.out.println("Result: " + result);
        System.out.println("Result: " + bigResult);
    }
}
