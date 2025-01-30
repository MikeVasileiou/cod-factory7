package projects.pushed;

import java.io.*;
import java.util.*;

public class Project01 {
    public static void main(String[] args) {
        try {
            int[] numbers = readNumFromFile("C:/numbers.txt");   // Read input file, easy path
            Arrays.sort(numbers); // Sort numbers
            List<int[]> combinations = generateCombo(numbers); // Generate all possible combinations
            writeValidComboToFile(combinations, "C:/output.txt"); //Write output file, easy path
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());  // if invalid file
        }
    }

    private static int[] readNumFromFile(String filename) throws IOException {   // Reads numbers and put them in an array
        List<Integer> numberList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num >= 1 && num <= 49) {
                    numberList.add(num);
                }
            }
        }
        if (numberList.size() < 6 || numberList.size() > 49) {   //if number of numbers not valid
            throw new IllegalArgumentException("File must contain between 6 and 49 numbers.");
        }
        return numberList.stream().mapToInt(Integer::intValue).toArray();
    }

    private static List<int[]> generateCombo(int[] numbers) {     // Generates all possible 6 number combinations
        List<int[]> combinations = new ArrayList<>();
        int n = numbers.length;
        for (int i = 0; i < n - 5; i++) {
            for (int j = i + 1; j < n - 4; j++) {
                for (int k = j + 1; k < n - 3; k++) {
                    for (int l = k + 1; l < n - 2; l++) {
                        for (int m = l + 1; m < n - 1; m++) {
                            for (int o = m + 1; o < n; o++) {
                                int[] combination = {numbers[i], numbers[j], numbers[k], numbers[l], numbers[m], numbers[o]};
                                if (isValidCombination(combination)) {
                                    combinations.add(combination);
                                }
                            }
                        }
                    }
                }
            }
        }
        return combinations;
    }

    private static boolean isValidCombination(int[] combo) {        // Checks for valid combinations
        return countEvenNum(combo) <= 4 &&
                countOddNum(combo) <= 4 &&
                countConsNum(combo) <= 2 &&
                countSameLastDig(combo) <= 3 &&
                countSetOfTen(combo) <= 3;
    }

    private static int countEvenNum(int[] combo) {  // Counts the even numbers
        return (int) Arrays.stream(combo).filter(num -> num % 2 == 0).count();
    }

    private static int countOddNum(int[] combo) {   // Counts the odd number
        return (int) Arrays.stream(combo).filter(num -> num % 2 != 0).count();
    }

    private static int countConsNum(int[] combo) {  // Counts consecutive numbers in the combination
        int count = 0;
        for (int i = 1; i < combo.length; i++) {
            if (combo[i] == combo[i - 1] + 1) count++;
        }
        return count;
    }

    private static int countSameLastDig(int[] combo) {  // Counts the numbers with the same last digit
        int[] endings = new int[10];
        for (int num : combo) {
            endings[num % 10]++;
        }
        return Arrays.stream(endings).max().orElse(0);
    }

    private static int countSetOfTen(int[] combo) {     // Counts the numbers in every set of ten
        int[] everyTen = new int[5];
        for (int num : combo) {
            everyTen[num / 10]++;
        }
        return Arrays.stream(everyTen).max().orElse(0);
    }

    private static void writeValidComboToFile(List<int[]> combinations, String filename) throws IOException {    // Writes valid combinations in an output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int[] combo : combinations) {
                writer.write(Arrays.toString(combo));
                writer.newLine();
            }
        }
        System.out.println("All combinations written to " + filename);
    }
}
