public class lesson3 {
    public static void main(String[] args) {
        int[][] array = new int[3][];
        array[0] = new int[2];
        array[1] = new int[3];
        array[2] = new int[5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j + i;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
