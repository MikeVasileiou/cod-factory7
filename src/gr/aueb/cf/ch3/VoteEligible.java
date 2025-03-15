package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου για άνω των 18
 * Έλεγχος ηλικίας
 */

public class VoteEligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int LOWEST_AGE = 18;
        int age = 0;
        boolean isEligible = false;


        System.out.println("Please insert age");
        age = in.nextInt();

        isEligible = age >= LOWEST_AGE;

        System.out.println("You are eligible: " + isEligible);


    }
}
