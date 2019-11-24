package HomeTask7;

import java.util.Scanner;

public class HomeTask7_7 {
    public static void main(String[] args) {
        System.out.println("Enter the date in YYYY/MM/DD HH:MM:SS format");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        if (date.matches("^((((19|[2-9]\\d)\\d{2})[\\/\\.-](0[13578]|1[02])[\\/\\.-](0[1-9]|[12]\\d|3[01])\\s(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]))|(((19|[2-9]\\d)\\d{2})[\\/\\.-](0[13456789]|1[012])[\\/\\.-](0[1-9]|[12]\\d|30)\\s(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]))|(((19|[2-9]\\d)\\d{2})[\\/\\.-](02)[\\/\\.-](0[1-9]|1\\d|2[0-8])\\s(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))[\\/\\.-](02)[\\/\\.-](29)\\s(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])))$")) {
            System.out.println("Date is valid");
        } else {
            System.out.println("Date is not valid");
        }
    }
}
