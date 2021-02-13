package by.epam.classes.task3;

import java.util.Arrays;

public class Student {
    private String lastNameAndInitials;
    private int groupNumber;
    private int[] progress;

    public Student(String lastNameAndInitials, int groupNumber, int[] progress) {
        this.lastNameAndInitials = lastNameAndInitials;
        this.groupNumber = groupNumber;
        this.progress = progress;
    }

    public static void bestStudents(Student[] students) {
        for (Student person: students) {
            if (person.goodProgress(person.progress)) {
                person.print();
            }
        }
    }

    @Override
    public String toString() {
        return  "Фамилия: " + lastNameAndInitials  +
                "\nНомер группы: " + groupNumber +
                "\nОценки: " + Arrays.toString(progress) + "\n";
    }

    public void print() {
        System.out.println(this.toString());
    }

    private boolean goodProgress(int[] progress) {
        boolean goodMarks;

        goodMarks = true;

        for (int mark : progress) {
            if (mark < 9) {
                goodMarks = false;
                break;
            }
        }
        return goodMarks;
    }
}