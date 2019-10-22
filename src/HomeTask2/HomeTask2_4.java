package HomeTasks.HomeTask2;

import java.util.Scanner;

public class HomeTask2_4 {
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("Enter the number less than 10");
            Scanner inNumber = new Scanner(System.in);
            number = inNumber.nextInt();
            if (number>=10){
                System.out.println("Entered number is more or equal to 10");
            }
        }while(number>=10);
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Day with such number doesn't exist");
        }

    }
}
