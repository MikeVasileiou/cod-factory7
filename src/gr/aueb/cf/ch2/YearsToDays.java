package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * convert years(ages) to day
 */

public class YearsToDays {
    public static void main(String[] args) {
        //  Δήλωση και αρχικοποίηση μεταβλητών

        Scanner scanner = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int age = 0;
        int days = 0;

        System.out.println("Plase insert your age");
        age = scanner.nextInt();

        days = age * DAYS_PER_YEAR;

        System.out.println("Age in years:" + age + ", Age in days:" + days);


    }
}
