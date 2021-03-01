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
        Student[] students = new Student[10];

        students[0] = new Student("Гуриновчи Д.В.", 3, new int[]{6, 7, 9, 9, 10});
        students[1] = new Student("Иванов А.И.", 2, new int[]{5, 8, 9, 7, 6});
        students[2] = new Student("Безмен И.А.", 1, new int[]{9, 10, 10, 9, 10});
        students[3] = new Student("Римашевский Д.А.", 2, new int[]{6, 7, 5, 5, 6});
        students[4] = new Student("Романчик Р.В.", 1, new int[]{4, 5, 6, 9, 7});
        students[5] = new Student("Невмержицкая В.О.", 3, new int[]{9, 9, 10, 9, 10});
        students[6] = new Student("Пентяк Ю.А.", 2, new int[]{9, 10, 10, 9, 9});
        students[7] = new Student("Басков А.П.", 1, new int[]{6, 7, 4, 4, 5});
        students[8] = new Student("Кутыш А.С.", 3, new int[]{9, 10, 7, 9, 10});
        students[9] = new Student("Гуриновчи И.Д.", 3, new int[]{10, 10, 10, 10, 10});

        Department department = new Department(students);
        DepartmentLogic logic = new DepartmentLogic();

        logic.searchBestStudents(department.getStudents());
    }

}
