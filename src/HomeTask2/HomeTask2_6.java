package HomeTask2;

import java.util.Scanner;

public class HomeTask2_6 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner inNumber = new Scanner(System.in);
        int number = inNumber.nextInt();
        int factorial = 1;
        do {
            factorial *= number;
            number--;
        } while (number > 1);
        System.out.println("Factorial = " + factorial);
    }
}
