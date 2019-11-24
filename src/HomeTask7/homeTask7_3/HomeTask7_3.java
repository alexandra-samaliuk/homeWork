package HomeTask7.homeTask7_3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class HomeTask7_3 {
    public static void main(String[] args) {
        System.out.println("Enter the text:");
        Scanner scanner = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer(scanner.nextLine());
        stringBuffer.reverse();
        try (FileOutputStream fileOutputStream = new FileOutputStream("E://HomeTasks//src//HomeTask7//homeTask7_3//text2.txt");
             PrintStream printStream = new PrintStream(fileOutputStream)) {
            printStream.println(stringBuffer);
            System.out.println("Data is added to the file");
        } catch (IOException ex) {
            System.out.println("File is not found");
        }
    }
}
