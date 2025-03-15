package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αντιστρέφει έναν ακέραιο. πχ. Το 123 γίνεται 321
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int num = 0;
                int reserved = 0;
                int tempNum = 0;
                int rightDigit = 0;
        System.out.println("Enter a positive integer");
        num = scanner.nextInt();


        //toDo
        tempNum = num;
        while (tempNum > 0) {
            rightDigit = tempNum / 10;
            reserved = reserved * 10 + rightDigit;
            tempNum = tempNum / 10;
        }

        System.out.println("The reserved number is: " + reserved);
    }
}
