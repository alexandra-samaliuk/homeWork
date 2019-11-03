package HomeTask3;

import java.util.Scanner;

public class HomeTask3_2 {
    public static void main(String[] args) {
        System.out.println("Введите выражение со скобками");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] countOpen = new int[str.length()];
        int[] countClose = new int[str.length()];
        int open = 0;
        int close = 0;
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                countOpen[open] = i;
                open++;
            }
            if (str.charAt(i) == ')') {
                countClose[close] = i;
                close++;
            }
        }
        if (open == close) {
            for (int i = 0; i < open; i++) {
                if (countClose[i] > countOpen[i]) {
                    result++;
                } else {
                    break;
                }
            }
            if (result == open && result != 0) {
                System.out.println("Выражение записано верно");
            } else {
                System.out.println("Скобки расположены в неправильном порядке или отсутствуют в выражении");
            }
        } else {
            System.out.println("Количество открывающих скобок не соответствует количеству закрывающих");
        }
    }
}
