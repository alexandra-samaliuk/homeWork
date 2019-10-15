import java.util.Scanner;

public class HomeTask2_19 {
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("Enter the number more than 1");
            Scanner inNumber = new Scanner(System.in);
            number = inNumber.nextInt();
            if (number <= 1) {
                System.out.println("Entered number is less or equal to 1");
            }
        } while (number <= 1);
        simple(number, number - 1);
    }

    static void simple(int x, int y) {
        if (y > 1) {
            if (x % y != 0) {
                simple(x, y - 1);
            } else {
                System.out.printf("Is number %d simple - NO", x);
            }
        }
        if (y == 1) {
            System.out.printf("Is number %d simple - YES", x);
        }
    }
}