package HomeTask3.homeTask3_5;

import java.util.Scanner;

public class HomeTask3_5 {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        char operation;
        int result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        operand1 = scan.nextInt();
        System.out.println("Введите второе число");
        operand2 = scan.nextInt();
        System.out.println("Введите \n  '+' для вычисления суммы, \n  '-' для вычисления разности, \n  '*' для вычисления произведения, \n  '/' для вычисления целого от деления, \n  '%' для вычисления остатка от дееления");
        operation = scan.next().charAt(0);
        Calculator calc = new Calculator();
        result = calc.calculate(operand1, operand2, operation);
        System.out.println("Результат - " + result);
    }
}
