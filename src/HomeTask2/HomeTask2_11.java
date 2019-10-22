package HomeTasks.HomeTask2;

import java.util.Random;
import java.util.Scanner;

public class HomeTask2_11 {
    public static void main(String[] args) {
        System.out.println("Enter the size of massive");
        Scanner inNumber = new Scanner(System.in);
        int number = inNumber.nextInt();
        int[] array = new int[number];
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
    }
}
