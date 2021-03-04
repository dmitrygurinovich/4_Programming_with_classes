package by.epam.classes.main;

import by.epam.classes.entity.Department;
import by.epam.classes.entity.Student;
import by.epam.classes.logic.DepartmentLogic;

/*
 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Gurinovich D.V.", 3, new int[]{6, 7, 9, 9, 10}),
                new Student("Ivanov A.I.", 2, new int[]{5, 8, 9, 7, 6}),
                new Student("Bezmen I.A.", 1, new int[]{9, 10, 10, 9, 10}),
                new Student("Rimazhevski D.A.", 2, new int[]{6, 7, 5, 5, 6}),
                new Student("Romanchik R.V.", 1, new int[]{4, 5, 6, 9, 7}),
                new Student("Nevmerzhickaya V.O.", 3, new int[]{9, 9, 10, 9, 10}),
                new Student("Pentyak J.A.", 2, new int[]{9, 10, 10, 9, 9}),
                new Student("Baskov A.P.", 1, new int[]{6, 7, 4, 4, 5}),
                new Student("Kutysh A.S.", 3, new int[]{9, 10, 7, 9, 10}),
                new Student("Gurinovich I.D.", 3, new int[]{10, 10, 10, 10, 10})
        };

        Department department = new Department(students);
        DepartmentLogic logic = new DepartmentLogic();

        for (Student student : logic.searchBestStudents(department.getStudents())) {
            System.out.println(student);
        }
    }

}
