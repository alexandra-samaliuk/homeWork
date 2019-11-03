package HomeTask3;

public class HomeTask3_1 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 18, 25, 68};
        int[] array2 = {5, 10, 38, 95};
        int[] arrayResult = new int[array1.length + array2.length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < arrayResult.length; i++) {
            if (array1[index1] < array2[index2]) {
                arrayResult[i] = array1[index1];
                if (index1 < array1.length-1) {
                    index1++;
                }
            } else {
                arrayResult[i] = array2[index2];
                if (index2 < array2.length-1) {
                    index2++;
                }
            }
        }
        for (int i = 0; i < arrayResult.length; i++) {
            System.out.print(arrayResult[i] + " ");
        }
    }
}
