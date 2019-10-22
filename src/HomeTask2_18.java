import java.util.Scanner;

public class HomeTask2_18 {
    public static void main(String[] args) {
        System.out.println("Enter the number of lines in massive");
        Scanner inNumber = new Scanner(System.in);
        int number = inNumber.nextInt();
        for (int i = 0; i < number; i++) {
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
