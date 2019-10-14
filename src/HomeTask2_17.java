import java.util.Random;
import java.util.Scanner;

public class HomeTask2_17 {
    public static void main(String[] args) {
        System.out.println("Enter the number of lines in massive");
        Scanner inNumber = new Scanner(System.in);
        int number = inNumber.nextInt();
        int[][] array = new int[number][];
        int[] arrayJ = new int[number];
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            arrayJ[i] = random.nextInt(10);
            array[i] = new int[arrayJ[i]];
            System.out.print(arrayJ[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < arrayJ[i]; j++) {
                array[i][j] = random.nextInt(200);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
