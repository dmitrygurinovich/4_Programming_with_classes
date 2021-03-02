package by.epam.classes.entity;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String lastNameAndInitials;
    private int groupNumber;
    private int[] progress;

    public Student() {

    }

    public Student(String lastNameAndInitials, int groupNumber, int[] progress) {
        this.lastNameAndInitials = lastNameAndInitials;
        this.groupNumber = groupNumber;
        this.progress = progress;
    }

    public String getLastNameAndInitials() {
        return lastNameAndInitials;
    }

    public void setLastNameAndInitials(String lastNameAndInitials) {
        this.lastNameAndInitials = lastNameAndInitials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getProgress() {
        return progress;
    }

    public void setProgress(int[] progress) {
        this.progress = progress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return groupNumber == student.groupNumber &&
                lastNameAndInitials.equals(student.lastNameAndInitials) &&
                Arrays.equals(progress, student.progress);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(lastNameAndInitials, groupNumber);
        result = 31 * result + Arrays.hashCode(progress);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastNameAndInitials='" + lastNameAndInitials + '\'' +
                ", groupNumber=" + groupNumber +
                ", progress=" + Arrays.toString(progress) +
                '}';
    }
}