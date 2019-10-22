package HomeTask2;

import java.util.Random;
import java.util.Scanner;

public class HomeTask2_14 {
    public static void main(String[] args) {
        System.out.println("Enter the size of massive");
        Scanner inNumber = new Scanner(System.in);
        int number = inNumber.nextInt();
        int[] array = new int[number];
        int max = 0;
        int min = 100;
        int avg = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            avg += array[i];
        }
        System.out.println("\nmax - " + max);
        System.out.println("min - " + min);
        System.out.println("average - " + (float)avg/number);
    }
}
