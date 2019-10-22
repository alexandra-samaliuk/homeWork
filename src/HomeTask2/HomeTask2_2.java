package HomeTasks.HomeTask2;

import java.util.Scanner;

public class HomeTask2_2 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner inNumber = new Scanner(System.in);
        int number = inNumber.nextInt();
        if (number % 2 == 0) {
            System.out.println("This number is even number");
        } else {
            System.out.println("This number is odd number");
        }
    }
}
