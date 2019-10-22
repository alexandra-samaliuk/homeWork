package HomeTasks.HomeTask2;

import java.util.Scanner;

public class HomeTask2_1 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner inNumber = new Scanner(System.in);
        int number = inNumber.nextInt();
        if (number == 7) {
            System.out.println("This number is 7");
        } else {
            System.out.println("This number is NOT 7");
        }
    }
}
