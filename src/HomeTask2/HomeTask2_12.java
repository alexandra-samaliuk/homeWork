package HomeTask2;

import java.util.Scanner;

public class HomeTask2_12 {
    public static void main(String[] args) {
        System.out.println("Enter the size of massive");
        Scanner inNumber = new Scanner(System.in);
        int number = inNumber.nextInt();
        int[] array = new int[number];
        int middle = number / 2;
        int j = middle;
        for (int i = 0; i < number; i++) {
            array[i] = j;
            if (i >= middle) {
                j++;
            } else {
                j--;
            }
            System.out.print(array[i] + " ");
        }
    }
}
