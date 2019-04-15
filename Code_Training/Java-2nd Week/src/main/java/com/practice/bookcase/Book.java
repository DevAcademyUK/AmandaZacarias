package com.practice.bookcase;

import java.sql.Connection;
import java.util.ArrayList;

public class Book {
    //creating the variables
    private int bookID;
    private String bookTitle;
    private String bookAuthor;
    private String bookYear;
    private String bookBlurb;
    private String coverURL;
    InitialiseDB initDB = new InitialiseDB();

    //This is crating the Array object
    public static ArrayList<Book> books= new ArrayList<>();

    public ArrayList<Book> getAllBooks(){
        books = initDB.getBooks(initDB.getDBconnection());

        return books;
    }

    // This is an empty constructor that we will be using once we create a new object
    public Book() {

    }

    //constructor of the variables
    public Book(int bookID, String bookTitle, String bookAuthor, String bookYear, String bookBlurb, String coverfURL) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.bookBlurb = bookBlurb;
        this.coverURL = coverfURL;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookYear() {
        return bookYear;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }

    public static void addNewBook (Book book) {
        if (books.size() > 0) {
            for (Book b: books) {
                if (!books.contains(book)) {
                    books.add(book);
                    break;
                } else
                    System.out.println("That book is already in your library");
            }
        } else {
            books.add(book);
        }
    }

    public String getBookBlurb() {
        return bookBlurb;
    }

    public void setBookBlurb(String bookBlurb) {
        this.bookBlurb = bookBlurb;
    }

    public String getCoverURL() {
        return coverURL;
    }

    public void setCoverURL(String coverURL) {
        this.coverURL = coverURL;
    }
}
