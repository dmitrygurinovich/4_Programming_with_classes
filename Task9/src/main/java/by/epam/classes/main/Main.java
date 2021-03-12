package by.epam.classes.main;

import by.epam.classes.entity.Book;
import by.epam.classes.entity.BooksBase;
import by.epam.classes.logic.BookBaseLogic;

/*
 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 методами. Задать критерии выбора данных и вывести эти данные на консоль.
 Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 Найти и вывести:
 a) список книг заданного автора;
 b) список книг, выпущенных заданным издательством;
 c) список книг, выпущенных после заданного года.
 */
public class Main {
    public static void main(String[] args) {
        BooksBase base = new BooksBase();
        BookBaseLogic logic = new BookBaseLogic();

        logic.addBook(base, "Ожог", "В. Аксенов", "ЗАО Азбука", 2019, 608, 9.69, "мягкий переплет");
        logic.addBook(base, "Остров Крым", "В. Аксенов", "ООО Издательство Эксмо", 2018, 608, 27.68, "твердый переплет");
        logic.addBook(base, "Оруэлл", "Ю. Фельштинский", "ОАО Молодая гвардия", 2019, 462, 35.19, "твердый переплет");
        logic.addBook(base, "Жизнь замечательных людей", "Б. Пастернак", "ОАО Молодая гвардия", 2007, 892, 25.91, "твердый переплет");
        logic.addBook(base, "Философия Java", "Брюс Эккель", "ООО Питер Мейл", 2021, 1168, 74.21, "твердый переплет");

        System.out.println("Результат поиска по автору:\n");
        for (Book book : logic.searchBookByAuthor(base, "Б. Пастернак")) {
            System.out.println(book);
        }

        System.out.println("Результат поиска по издательству:\n");
        for (Book book : logic.searchBookByPublishingHouse(base, "ОАО Молодая гвардия")) {
            System.out.println(book);
        }

        System.out.println("Книги, изданные позже заданного года:\n");
        for (Book book : logic.searchBookByYear(base, 2018)) {
            System.out.println(book);
        }
    }
}
