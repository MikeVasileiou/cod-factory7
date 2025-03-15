package gr.aueb.cf.solutions;

import java.util.Scanner;

public class ScannerAddApp {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        //Εντολές
        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.printf("Το άρθροισμα των %d και %d είναι ίσο με %d", num1, num2, sum);

    }
}
