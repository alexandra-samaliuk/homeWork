package HomeTask3.homeTask3_4;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeTask3_4 {
    public static void main(String[] args) {
        String name;
        String surname;
        String dateOfBirthday;
        int course;
        System.out.println("Введите количество студентов");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ArrayList<Student> students = new ArrayList<Student>();
        for (int i = 0; i < number; i++){
            System.out.println("Введите имя");
            name = scanner.next();
            System.out.println("Введите фамилию");
            surname = scanner.next();
            System.out.println("Введите дату рождения");
            dateOfBirthday = scanner.next();
            System.out.println("Введите курс");
            course = scanner.nextInt();
            students.add(new Student(name, surname, dateOfBirthday, course));
        }
        System.out.println("Введите курс по которому хотите получить список");
        Student.printStudents(students, scanner.nextInt());
    }

}
