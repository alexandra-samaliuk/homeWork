package HomeTasks.HomeTask2;

import java.util.Random;
import java.util.Scanner;

public class HomeTask2_16 {
    public static void main(String[] args) {
        System.out.println("Enter the size of massive");
        Scanner inNumber = new Scanner(System.in);
        int number = inNumber.nextInt();
        int number2 = inNumber.nextInt();
        int[][] array = new int[number][number2];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(200);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]%2 + " ");
            }
            System.out.println();
        }
    }
}
