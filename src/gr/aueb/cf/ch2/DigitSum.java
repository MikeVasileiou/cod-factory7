package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        int doubledigit = 0;
        int leftdigit = 0;
        int rightdigit= 0;
        int sum =0;

        Scanner in = new Scanner(System.in);

        //εντολές
        System.out.println("Please type doubledigit");
        doubledigit = in.nextInt();
        leftdigit = doubledigit / 10;
        rightdigit = doubledigit % 10;
        sum = leftdigit + rightdigit;
        System.out.printf("doubledigit = %d, leftdigit = %d, rightdigit = %d, result is %d", doubledigit, leftdigit, rightdigit, sum);

    }
}
