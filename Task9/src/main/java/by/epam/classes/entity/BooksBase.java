package by.epam.classes.entity;

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
import java.util.Objects;

public class BooksBase {
    private ArrayList<Book> base = new ArrayList<>();

    public BooksBase() {

    }

    public ArrayList<Book> getBase() {
        return base;
    }

    public void setBase(ArrayList<Book> base) {
        this.base = base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BooksBase base1 = (BooksBase) o;
        return Objects.equals(base, base1.base);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base);
    }
}
