package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Πρόσθεση όλων των άρτιων από το 2 μέχρι ένα όριο που θα δώσει ο χρήστης.
 */
public class SumOfEvens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Please insert upper limit");
        inputNum = scanner.nextInt();

        while (i <= inputNum) {
            sum += i;
            i +=2;
        }

        //sum??

        System.out.println("The sum of even numbers up tp " + inputNum + " is: " + sum);


    }
}
