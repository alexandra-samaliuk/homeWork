import java.util.Scanner;

public class HomeTask2_19 {
    public static void main(String[] args) {
        System.out.println("Enter the number more than 1");
        Scanner inNumber = new Scanner(System.in);
        int number = inNumber.nextInt();
        Simple(number, number-1);
    }

    static void Simple(int x, int y) {
        if (y > 1) {
            if (x % y != 0) {
                Simple(x,y-1);
            }
            else {
                System.out.printf("Is number %d simple - NO", x);
                return;
            }
        }
        if (y == 1){
            System.out.printf("Is number %d simple - YES",x);
            return;
        }
    }
}