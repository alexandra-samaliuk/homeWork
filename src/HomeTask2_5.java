import java.util.Scanner;

public class HomeTask2_5 {
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("Enter the number more than 3");
            Scanner inNumber = new Scanner(System.in);
            number = inNumber.nextInt();
            if (number <= 3) {
                System.out.println("Entered number is less or equal to 3");
            }
        } while (number <= 3);
        for (int i = 0; i <= number; i += 2) {
            System.out.print(i + " ");
        }
    }
}
