package homeTask5.homeTask5_2;

import java.util.Scanner;

public class HomeTask5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер буквы, которую хотите вывести");
        int letterNumber = scanner.nextInt();
        if (letterNumber > 0 && letterNumber < 27) {
            System.out.println(Alphabet.values()[letterNumber-1]);
        } else {
            System.out.println("Такой буквы не существует");
        }
    }
}
