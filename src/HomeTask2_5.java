import java.util.Scanner;

public class HomeTask2_5 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner inNumber = new Scanner(System.in);
        int number = inNumber.nextInt();
        for (int i = 0; i <= number; i += 2) {
            System.out.print(i + " ");
        }
    }
}
