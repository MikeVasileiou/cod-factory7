package projects.pushed;

import java.util.Scanner;

public class Project05 {
    private static final int ROWS = 30;
    private static final int COLUMNS = 12;
    private static boolean[][] seats = new boolean[ROWS][COLUMNS];

    public static void book(char column, int row) {  //Books a seat using column letter(A-L) and row number(1-30)
        int colIndex = column - 'A';
        int rowIndex = row - 1;
        if (isValidSeat(colIndex, rowIndex)) {
            if (!seats[rowIndex][colIndex]) {
                seats[rowIndex][colIndex] = true;
                System.out.println("Seat " + column + row + " booked successfully.");
            } else {
                System.out.println("Seat " + column + row + " is already booked.");
            }
        } else {
            System.out.println("Invalid seat.");
        }
    }

    public static void cancel(char column, int row) {      //Cancels a seat using column letter(A-L) and row number(1-30)
        int colIndex = column - 'A';    // Convert column letter to numeric index
        int rowIndex = row - 1;         // Convert row number to array index
        if (isValidSeat(colIndex, rowIndex)) {
            if (seats[rowIndex][colIndex]) {
                seats[rowIndex][colIndex] = false;
                System.out.println("Seat " + column + row + " canceled successfully.");
            } else {
                System.out.println("Seat " + column + row + " is not booked.");
            }
        } else {
            System.out.println("Invalid seat.");
        }
    }

    private static boolean isValidSeat(int col, int row) {     //Check if the seat is valid
        return row >= 0 && row < ROWS && col >= 0 && col < COLUMNS;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter command (book/cancel/exit):");
            String command = scanner.next().toLowerCase();
            if (command.equals("exit")) {
                break;
            }
            System.out.println("Enter seat (e.g., D4):");
            String seat = scanner.next().toUpperCase();
            char column = seat.charAt(0);
            int row = Integer.parseInt(seat.substring(1));
            if (command.equals("book")) {
                book(column, row);
            } else if (command.equals("cancel")) {
                cancel(column, row);
            } else {
                System.out.println("Invalid command.");
            }
        }
        scanner.close();
    }
}
