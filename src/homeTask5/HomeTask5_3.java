package homeTask5;

import java.util.ArrayList;

public class HomeTask5_3 {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 2, 4, 3, 6};
        String[] array2 = {"a", "b", "c", "d", "e"};
        ArrayList<Integer> array1List = new ArrayList<>();
        ArrayList<String> array2List = new ArrayList<>();
        for(int a1 : array1){
            array1List.add(a1);
        }
        for(String a2 : array2){
            array2List.add(a2);
        }

        for(Integer a1 : array1List){
            System.out.println(a1);
        }
        for(String a2 : array2List){
            System.out.println(a2);
        }
    }
}
