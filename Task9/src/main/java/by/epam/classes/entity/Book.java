package by.epam.classes.entity;

import java.util.Objects;

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
public class Book {
    private static int defaultID = 1;
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int year;
    private int pagesCount;
    private double price;
    private String cover;

    public Book(String name, String author, String publishingHouse, int year, int pagesCount, double price, String cover) {
        this.id = defaultID++;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pagesCount = pagesCount;
        this.price = price;
        this.cover = cover;
    }

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                year == book.year &&
                pagesCount == book.pagesCount &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publishingHouse, book.publishingHouse) &&
                Objects.equals(cover, book.cover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, publishingHouse, year, pagesCount, price, cover);
    }

    @Override
    public String toString() {
        return  "ID: " + id +
                "\nНазвание: " + name  +
                "\nАвтор: " + author +
                "\nИздательство: " + publishingHouse +
                "\nГод: " + year +
                "\nКоличество страниц: " + pagesCount +
                "\nЦена: " + price + " р." +
                "\nОбложка: " + cover + "\n";
    }
}
