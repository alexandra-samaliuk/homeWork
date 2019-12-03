package HomeTask8.homeTask8_2;

import java.util.Scanner;

public class HomeTask8_2 {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        char operation;
        Operation operation1 = (x, y) -> x + y;
        Operation operation2 = (x, y) -> x - y;
        Operation operation3 = (x, y) -> x * y;
        Operation operation4 = (x, y) -> x % y;
        Operation operation5 = (x, y) -> x / y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        operand1 = scan.nextInt();
        System.out.println("Введите второе число");
        operand2 = scan.nextInt();
        System.out.println("Введите \n  '+' для вычисления суммы, \n  '-' для вычисления разности, \n  '*' для вычисления произведения, \n  '/' для вычисления целого от деления, \n  '%' для вычисления остатка от дееления");
        operation = scan.next().charAt(0);
        switch (operation) {
            case '+': {
                System.out.println("Результат - " + operation1.calculate(operand1, operand2));
                break;
            }
            case '-': {
                System.out.println("Результат - " + operation2.calculate(operand1, operand2));
                break;
            }
            case '*': {
                System.out.println("Результат - " + operation3.calculate(operand1, operand2));
                break;
            }
            case '/': {
                System.out.println("Результат - " + operation5.calculate(operand1, operand2));
                break;
            }
            case '%': {
                System.out.println("Результат - " + operation4.calculate(operand1, operand2));
                break;
            }
            default: {
                System.out.println("Данная операция не поддерживается");
            }
        }
    }
}
