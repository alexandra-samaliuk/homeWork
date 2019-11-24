package HomeTask7;

import java.util.Scanner;

public class HomeTask7_6 {
    public static void main(String[] args) {
        System.out.println("Enter the IP address");
        Scanner scanner = new Scanner(System.in);
        String ipAddress = scanner.nextLine();
        if (ipAddress.matches("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$")) {
            System.out.println("IP is valid");
        } else {
            System.out.println("IP is not valid");
        }
    }
}
