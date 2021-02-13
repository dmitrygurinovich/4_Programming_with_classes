package by.epam.classes.task2;

/*
 2. Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
 конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
 класса.
 */
public class Main {
    public static void main(String[] args) {
        Test2 test = new Test2();
        System.out.println("Name: " + test.getName() + "\nAge: " + test.getAge());

        Test2 test1 = new Test2("Dmitry", 31);
        System.out.println("Name: " + test1.getName() + "\nAge: " + test1.getAge());

        test1.setName("Vasili");
        test1.setAge(55);
        System.out.println("Name: " + test1.getName() + "\nAge: " + test1.getAge());
    }
}
