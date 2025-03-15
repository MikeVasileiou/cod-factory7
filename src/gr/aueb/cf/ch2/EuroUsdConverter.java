package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUsdConverter {
    public static void main(String[] args) {
        //Δηλώσεις
        final int convertion_rate = 99;
        int euro = 0;
        int usd = 0;
        int cents = 0;
        int conv = 0;
        Scanner in = new Scanner(System.in);
        //Εντολες
        System.out.println("Please type euro to convert");
        euro = in.nextInt();
        conv = euro * convertion_rate;
        usd = conv /100;
        cents = conv %100;


        System.out.printf("the conversion is %d usd and %d cents",usd, cents);


    }
}
