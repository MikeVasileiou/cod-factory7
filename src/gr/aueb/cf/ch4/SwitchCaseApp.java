package gr.aueb.cf.ch4;

import java.awt.*;
import java.util.Scanner;

/**
 * demo of switch
 */
public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int choice;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω");
            System.out.println("1. One player game");
            System.out.println("2. Two player game");
            System.out.println("3. Team game");
            System.out.println("4. quit");

            choice = scanner.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Choice must be between 1-4");
                System.out.println("Try again");
            }

            if (choice == 1) {
                System.out.println("one player game started");
            } else if (choice == 1) {
                System.out.println("Two player game started");

            }else if (choice == 1) {
                System.out.println("Team game started");
            }else if (choice == 1) {
                System.out.println("Quitting game");
            }

            switch (choice) {
                case 1:
                    System.out.println("one player game started");
                    break;
                case 2:
                    System.out.println("Two player game started");
                    break;
                case 3:
                    System.out.println("Team game started");
                    break;
                case 4:
                    System.out.println("Quitting");
                    break;

            }

        } while (choice != 4);
    }
}
