package gr.aueb.cf.ch4;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.Scanner;

public class ChatInApp {
    public static void main(String[] args) throws IOException {
        char ch = ' ';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character");
        //ch = (char) System.in.read();
        ch = scanner.nextLine().charAt(0);

        System.out.printf("%c", ch);
    }
}
