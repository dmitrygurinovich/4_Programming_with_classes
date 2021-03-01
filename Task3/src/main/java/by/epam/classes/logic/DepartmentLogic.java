package by.epam.classes.logic;

import by.epam.classes.entity.Student;

public class DepartmentLogic {

    public DepartmentLogic() {

    }

    public void searchBestStudents(Student[] students) {
        boolean goodStudent;
        for (Student person : students) {
            goodStudent = true;
            for (int grade : person.getProgress()) {
                if (grade < 9) {
                    goodStudent = false;
                }
            }
            if (goodStudent) {
                print(person);
            }
        }
    }

    public static void print(Student student) {
        System.out.println("Фамилия: " + student.getLastNameAndInitials() +
                "\nНомер группы: " + student.getGroupNumber() + "\n");
    }
}
