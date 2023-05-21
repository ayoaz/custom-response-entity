package main;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private int bookId;
    private double price;
    private String bookName;


    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }


    Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", price=" + price +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    public static List<Book> getBooks(){
        List<Book> book = new ArrayList<>();
        book.add(new Book(111, "Brighter Grammar", 100.12));
        book.add(new Book(112, "Ali go to school", 101.12));
        book.add(new Book(113, "All things good", 10.12));
        book.add(new Book(114, "Big Woman", 11.12));
        book.add(new Book(115, "Eagle Ray", 190.12));
        book.add(new Book(116, "Grammar Class", 70.12));
        book.add(new Book(117, "Birthday Party", 500.12));
        book.add(new Book(118, "Price and Cost", 99.99));
        return book;
    }
}
