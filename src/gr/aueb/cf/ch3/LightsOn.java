package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining & car is running(100) or is dark
 */
public class LightsOn {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int MAX_CAR_SPEED = 100;
        boolean lightsOn = false;
        int speed = 0;
        boolean isDark = false;
        boolean isRaining = false;
        boolean isCarRunning = false;

        System.out.println("is it raining?");
        isRaining = in.nextBoolean();

        System.out.println("is it Dark?");
        isDark = in.nextBoolean();

        System.out.println("Insert car speed");
        speed = in.nextInt();

        isCarRunning = speed > MAX_CAR_SPEED;


        lightsOn = (isRaining && isDark) || (isRaining && isCarRunning);

        System.out.println("Lights on:" + lightsOn);
    }
}
