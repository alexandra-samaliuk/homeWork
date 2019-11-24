package HomeTask7;

import java.util.Scanner;

public class HomeTask7_8 {
    public static void main(String[] args) {
        System.out.println("Enter the URL");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        if (date.matches("^(http|https)://[a-z]{2,20}.[a-z]{2,20}/*")) {
            System.out.println("URL is valid");
        } else {
            System.out.println("URL is not valid");
        }
    }
}
