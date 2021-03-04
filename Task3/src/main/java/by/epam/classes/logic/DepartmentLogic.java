package by.epam.classes.logic;

import by.epam.classes.entity.Student;

public class DepartmentLogic {

    public DepartmentLogic() {

    }

    public Student[] searchBestStudents(Student[] students) {
        Student[] bestStudents;
        int countOfBestStudents;
        boolean goodStudent;

        countOfBestStudents = 0;

        for (Student person : students) {
            goodStudent = true;
            for (int grade : person.getProgress()) {
                if(grade < 9) {
                    goodStudent = false;
                }
            }

            if (goodStudent) {
                countOfBestStudents++;
            }
        }
        bestStudents = new Student[countOfBestStudents];

        int j = 0;
        for (Student person : students) {
            goodStudent = true;
            for (int grade : person.getProgress()) {
                if (grade < 9) {
                    goodStudent = false;
                }
            }
            if (goodStudent) {
                bestStudents[j] = person;
                j++;
            }
        }
        return bestStudents;
    }
}
