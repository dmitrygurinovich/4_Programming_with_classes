package by.epam.classes.task9;

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
import java.util.ArrayList;

public class BooksBase {
    private ArrayList<Book> base = new ArrayList<>();

    public ArrayList<Book> getBase() {
        return base;
    }

    public void setBase(ArrayList<Book> base) {
        this.base = base;
    }

    void searchBookByPublishingHouse(String publishingHouse) {
        System.out.println("По запросу \"" + publishingHouse +"\" найдено:\n");
        for(Book book : base) {
            if(book.getPublishingHouse() == publishingHouse) {
                System.out.println(book.toString());
            }
        }

    }

    void searchBookByYear(int year) {
        System.out.println("Книги, выпущенные после " + year +"-го года:\n");
        for (Book book : base) {
            if (book.getYear() > year) {
                System.out.println(book.toString());
            }
        }

    }

    void searchBookByAuthor(String author) {
        System.out.println("По запросу \"" + author +"\" найдено:\n");
        for(Book book : base) {
            if(book.getAuthor() == author) {
                System.out.println(book.toString());
            }
        }

    }

    void addBook(String name, String author, String publishingHouse, int year, int pagesCount, double price, String cover) {
        base.add(new Book(name, author, publishingHouse, year, pagesCount, price, cover));
    }

}
