package HomeTask3;

import java.util.ArrayList;

public class HomeTask3_4 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Name1", "Surname1", "11.10.10", 1));
        students.add(new Student("Name2", "Surname2", "12.10.10", 2));
        students.add(new Student("Name3", "Surname3", "13.10.10", 4));
        students.add(new Student("Name4", "Surname4", "14.10.10", 3));
        students.add(new Student("Name5", "Surname5", "15.10.10", 1));
        students.add(new Student("Name6", "Surname6", "16.10.10", 3));

        Student.printStudents(students, 3);
    }

}
