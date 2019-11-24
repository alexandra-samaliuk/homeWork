package HomeTask7.homeTask7_1_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class HomeTask7_1 {
    public static void main(String[] args) {
        System.out.println("Enter the file name:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        final String FILENAME2 = "E://HomeTasks//src//HomeTask7//homeTask7_1_2//" + fileName;
        try (FileInputStream fileInputStream = new FileInputStream(FILENAME2)) {
            int symbol = 0;
            while (fileInputStream.read() != -1) {
                if (fileInputStream.read() > symbol) {
                    symbol = fileInputStream.read();
                }
            }
            System.out.println("Max byte = " + symbol);
            System.out.println("Symbol with max byte: " + (char) symbol);
        } catch (IOException e) {
            System.out.println("File is not found or file is empty");
        }
    }
}
