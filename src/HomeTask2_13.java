import java.util.Random;
import java.util.Scanner;

public class HomeTask2_13 {
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("Enter the even size of massive");
            Scanner inNumber = new Scanner(System.in);
            number = inNumber.nextInt();
            if (number % 2 != 0) {
                System.out.println("Entered number is odd");
            }
        } while (number % 2 != 0);
        int[] array = new int[number];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int size2 = number / 2;
        int[] array1 = new int[size2];
        int[] array2 = new int[size2];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array[i];
            array2[i] = array[i + size2];
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("");
        int[] arraySum = new int[size2];
        for (int i = 0; i < array1.length; i++) {
            arraySum[i] = array1[i] + array2[i];
            System.out.print(arraySum[i] + " ");
        }

    }
}
