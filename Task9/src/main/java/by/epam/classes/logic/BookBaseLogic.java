package by.epam.classes.logic;

import by.epam.classes.entity.Book;
import by.epam.classes.entity.BooksBase;

import java.util.ArrayList;

public class BookBaseLogic {
    public BookBaseLogic() {

    }

    public void addBook(BooksBase base, String name, String author, String publishingHouse, int year, int pagesCount, double price, String cover) {
        base.getBase().add(new Book(name, author, publishingHouse, year, pagesCount, price, cover));
    }

    public ArrayList<Book> searchBookByPublishingHouse(BooksBase base, String publishingHouse) {
        ArrayList<Book> searchResult = new ArrayList<>();

        for (Book book : base.getBase()) {
            if (book.getPublishingHouse().equals(publishingHouse)) {
                searchResult.add(book);
            }
        }

        return searchResult;
    }

    public ArrayList<Book> searchBookByYear(BooksBase base, int year) {
        ArrayList<Book> searchResult = new ArrayList<>();

        for (Book book : base.getBase()) {
            if (book.getYear() > year) {
                searchResult.add(book);
            }
        }

        return searchResult;
    }

    public ArrayList<Book> searchBookByAuthor(BooksBase base, String author) {
        ArrayList<Book> searchResult = new ArrayList<>();

        for (Book book : base.getBase()) {
            if (book.getAuthor().equals(author)) {
                searchResult.add(book);
            }
        }

        return searchResult;
    }
}
