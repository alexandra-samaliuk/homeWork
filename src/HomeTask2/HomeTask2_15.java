package HomeTask2;

import java.util.Random;
import java.util.Scanner;

public class HomeTask2_15 {
    public static void main(String[] args) {
        System.out.println("Enter the size of massive");
        Scanner inNumber = new Scanner(System.in);
        int number = inNumber.nextInt();
        int[] array = new int[number];
        Random random = new Random();
        int temp;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
