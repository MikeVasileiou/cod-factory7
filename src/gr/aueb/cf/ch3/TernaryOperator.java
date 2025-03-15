package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Demo of ternary operator on a common use case, that is conditional asignment
 */
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int num;
        int abs=0;

        System.out.println("Please enter a number");
        num = scanner.nextInt();

//        if (num >= 0) abs = num;
//        else abs = -num;

        //Ternary operator
        abs = (num >= 0) ? num : -num;
        System.out.println("abs: " + abs);
    }
}
