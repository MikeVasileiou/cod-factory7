package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfCopyApp {
    public static void main(String[] args) {

        int b;
        int counter = 0;
        long start = 0;
        long end;
        double elapsedTime = 0.0;

        try (FileInputStream fis = new FileInputStream("C:/tmp/dummy.pdf");
             FileOutputStream fos = new FileOutputStream("C:/tmp/dummy-out.pdf")) {
            while ((b = fis.read()) != -1) {
                fos.write(b);
                counter++;

            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;

            System.out.printf("Το αρχείο με μέγεθος %.1fKB (%d bytes) αντιγραφηκε \n",
            (counter / 1024.0), counter);
            System.out.println("Elapsed time: " + elapsedTime + "Seconds");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
