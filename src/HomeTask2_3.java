import java.util.Scanner;

public class HomeTask2_3 {
    public static void main(String[] args) {
        System.out.println("Enter the long of rectangle sides");
        Scanner inNumber = new Scanner(System.in);
        int length = inNumber.nextInt();
        int width = inNumber.nextInt();
        System.out.println("Enter the radius of circle");
        int radius = inNumber.nextInt();
        float diagonal = (float) (Math.sqrt(width * width + length * length));
        if (diagonal <= (float) (radius * 2)) {
            System.out.println("The circle can cover rectangle");
        } else {
            System.out.println("The circle can't cover rectangle");
        }
    }
}
