package HomeTask2;

public class HomeTask2_9 {
    public static void main(String[] args) {
        int i = 1;
        for (char letter = 65; letter <= 90; letter++) {
            System.out.print(letter);
            if (i % 4 == 0) {
                System.out.println();
            }
            i++;
        }

    }
}
