package HomeTask8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HomeTask8_4 {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double result = number1 + number2;
        System.out.println(result);
        String text = Double.toString(result);
        if (text.charAt(text.length() - 1) == '0') {
            text = text.substring(0, text.length() - 2);
            System.out.println(text);
        } else {
            int index = text.indexOf('.');
            if (index > 1) {
                StringBuffer stringBuffer = new StringBuffer(text);
                stringBuffer.delete(0, index - 1);
                text = stringBuffer.toString();
            }
            Stream<Character> charsStream = text.chars().mapToObj(x -> (char) x);
            charsStream.forEach(s -> {
                if (s > 47 && s < 59) {
                    s = '0';
                }
                System.out.print((char) s);
            });
        }
    }
}
