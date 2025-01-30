package projects.pushed;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Project03 {
    private static final int SIZE = 128;    // Maximum number of Latin characters (ASCII)
    private static int[][] charCount = new int[SIZE][2];    // 128x2 array for characters and their frequencies

    public static void main(String[] args) {
        initializeArray();          // Initialize the array with ASCII values and zero frequencies

        try {

            Scanner scanner = new Scanner(new File("C:/input.txt")); //Read input file
            while (scanner.hasNext()) {
                String line = scanner.nextLine(); // Read each line from the file
                processLine(line); // Process characters in the line
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");  // Message if the file is not found
            return;
        }

        printStatistics();
    }

    private static void initializeArray() {     //Initializes the charCount array.
        for (int i = 0; i < SIZE; i++) {
            charCount[i][0] = i;        // The character (ASCII)
            charCount[i][1] = 0;        // Initialize frequency to 0
        }
    }

    private static void processLine(String line) {      //Process each line and update accordingly
        for (char c : line.toCharArray()) {         // For each character in the line
            if (!Character.isWhitespace(c) && c < SIZE) {   // If it is not whitespace and belongs to ASCII
                charCount[c][1]++;          // Increase the frequency of the character
            }
        }
    }

    private static void printStatistics() {     //Prints character frequency
        Arrays.sort(charCount, Comparator.comparingInt(a -> a[0])); // Sort by character (first column)
        System.out.println("Character statistics sorted by character:");
        for (int[] entry : charCount) {
            if (entry[1] > 0) {     // Display only characters that were found
                System.out.println((char) entry[0] + ": " + entry[1]);
            }
        }

        Arrays.sort(charCount, (a, b) -> Integer.compare(b[1], a[1]));    // Sort by frequency (second column)
        System.out.println("\nCharacter statistics sorted by frequency:");
        for (int[] entry : charCount) {
            if (entry[1] > 0) {     // Display only characters that were found
                System.out.println((char) entry[0] + ": " + entry[1]);
            }
        }
    }
}
