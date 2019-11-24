package homeTask5;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeTask5_3 {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 2, 4, 3, 6};
        ArrayList<Integer> array1List = new ArrayList<>();
        ArrayList<String> array2List = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        for (int a1 : array1) {
            array1List.add(a1);
        }

        for (Integer a1 : array1List) {
            System.out.println(a1);
        }
        for (String a2 : array2List) {
            System.out.println(a2);
        }
    }
}
