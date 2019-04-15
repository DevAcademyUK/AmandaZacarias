package com.practice.bookcase;

import org.sqlite.SQLiteConfig;

import java.sql.*;
import java.util.ArrayList;

@SuppressWarnings("Duplicates")
public class InitialiseDB {

    public static void main(String[] args) {
        InitialiseDB initDB = new InitialiseDB();
        initDB.createTables(initDB.connectDB());
    }

    private Connection connectDB() {
        Connection con = null;
        //exception handle
        try {
            Class.forName("org.sqlite.JDBC");
            SQLiteConfig config = new SQLiteConfig(); // defines the class that we're going to use, new instance of the class object SQLite
            config.enforceForeignKeys(true); //enforce the foreign keys to be true. As default they're false.
            con = DriverManager.getConnection("jdbc:sqlite:" +    // if the db doesn't exist it creates for you
                            "C:/Users/HP/Desktop/DevAcademy/Code_Training/Java-2nd Week/lib/BooksDatabase.db",
                    config.toProperties()); //updates the sqlite configuration
        } catch (Exception ex) { //run the method and give the user feedback
            System.out.println(ex.getClass());
            ex.printStackTrace();
        }
        return con;
    }

    public Connection getDBconnection() {
        Connection con = connectDB();
        createTables(con);
        return con;
    }

    private void createTables(Connection con) {
        try {
            Statement stmnt = con.createStatement();
            String createBooksTable = "CREATE TABLE IF NOT EXISTS tblBooks" +
                    "(book_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "book_title TEXT NOT NULL," +
                    "book_author TEXT NOT NULL," +
                    "book_released TEXT NOT NULL," +
                    "book_blurb TEXT NOT NULL," +
                    "book_cover TEXT NOT NULL)";
            stmnt.executeUpdate(createBooksTable);
        } catch (Exception ex) {
            System.out.println(ex.getClass());
            //ex.printStackTrace();
        }
    }

    public ArrayList<Book> getBooks(Connection con) {
        // we pass a method as a parameter to connect with DB

        ArrayList<Book> books = new ArrayList<>();
        Statement stmnt = null;
        //We create a SQL statement object. We put because we cannot leave without value.

        try {
            String getBooksQuery = "SELECT * FROM tblBooks";
            stmnt = con.createStatement();
            ResultSet rs = stmnt.executeQuery(getBooksQuery);

            while (rs.next()) {

                Book book = new Book();
                book.setBookID(rs.getInt("book_id"));
                book.setBookTitle(rs.getString("book_title"));
                book.setBookAuthor(rs.getString("book_author"));
                book.setBookYear(rs.getString("book_released"));
                book.setBookBlurb(rs.getString("book_blurb"));
                book.setCoverURL(rs.getString("book_cover"));

                books.add(book);
            }
                } catch (Exception ex) {
                    System.out.println(ex.getClass());
                    ex.printStackTrace();
                } finally {
                    try {
                        stmnt.close();
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

            return books;


    }


}









