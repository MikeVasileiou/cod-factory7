package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * calculates the price with vat
 */

public class RiseWithVat {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final double VAT_RATE = 0.24;
        double poso = 0;
        double posomefpa = 0;
        double fpa = 0;


        System.out.println("Δώσε το ποσό");
        poso = in.nextDouble();
        fpa = poso * VAT_RATE;
        posomefpa = poso + fpa;
        System.out.printf("Ποσο: %.2f, ΦΠΑ: %.2f, Ποοό με ΦΠΑ: %.2f", poso, fpa, posomefpa);
    }
}
