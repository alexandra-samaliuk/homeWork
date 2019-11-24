package HomeTask7.homeTask7_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeTask7_4 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("E://HomeTasks//src//HomeTask7//homeTask7_4//text3.txt"))) {
            String text;
            text = bufferedReader.readLine();
            System.out.println(text);
            String[] array = text.split(" ");
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        } catch (IOException e) {
            System.out.println("File is not found or file is empty");
        }
    }
}
