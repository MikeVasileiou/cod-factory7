package gr.aueb.cf.ch2;

import java.util.Scanner;

public class TimeToSeconds {
    public static void main(String[] args) {
        //δηλώσεις
        final int SECONDS_PER_DAY = 24 * 3600;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int totalseconds = 0;
        Scanner in = new Scanner(System.in);

        //εντολές

        System.out.println("Please type days");
        days = in.nextInt();
        System.out.println("Please type hours");
        hours = in.nextInt();
        System.out.println("Please type minutes");
        minutes = in.nextInt();
        System.out.println("Please type seconds");
        seconds = in.nextInt();
        totalseconds = SECONDS_PER_DAY * days + SECONDS_PER_HOUR * hours + SECONDS_PER_MINUTE * minutes + seconds;
        System.out.printf("The result is %d seconds", totalseconds);

    }
}
