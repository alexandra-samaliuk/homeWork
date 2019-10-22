package HomeTasks.HomeTask2;

import java.util.Random;
import java.util.Scanner;

public class HomeTask2_17 {
    public static void main(String[] args) {
        System.out.println("Enter the number of lines in massive");
        Scanner inNumber = new Scanner(System.in);
        int number = inNumber.nextInt();
        int[][] array = new int[number][];
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            array[i] = new int[random.nextInt(9)+1];
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(200);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
