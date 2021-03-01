package by.epam.classes.entity;

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
}
