package HomeTask8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class HomeTask8_3 {
    public static void main(String[] args) {
        System.out.println("Enter the text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        Stream<String> wordsStream = Arrays.stream(words);
        wordsStream.distinct().forEach(s -> System.out.println(s + " - " + Arrays.stream(words).filter(s1 -> s.compareTo(s1) == 0).count()));
    }
}
