package by.epam.classes.entity;

import java.util.Arrays;

public class Department {
    private Student[] students;

    public Department() {

    }

    public Department(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Arrays.equals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(students);
    }

    @Override
    public String toString() {
        return "Department{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
