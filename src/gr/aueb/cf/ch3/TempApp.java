package gr.aueb.cf.ch3;

// Μάθημα Boolean


import java.util.Scanner;

public class TempApp {
    public static void main(String[] args) {
        int temp = 0;
        boolean isTempBelowZero;
        Scanner in = new Scanner(System.in);

        System.out.println("Insert temperature");
        temp = in.nextInt();

        isTempBelowZero = temp < 0;
        System.out.println("temperature is below zero: "+ isTempBelowZero);

    }
}
