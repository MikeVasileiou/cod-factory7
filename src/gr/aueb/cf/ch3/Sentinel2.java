package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Sentinel2 {
    public static void main(String[] args) {
        int positiveCount =0 ;
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        System.out.println("Please insert a num");
        inputNum = in.nextInt();

        while ((inputNum = in.nextInt()) >=0) {
            positiveCount++;
            System.out.println("Please insert a num");
            inputNum = in.nextInt();

        }
        System.out.println("Positives count:" + positiveCount);
    }
}
