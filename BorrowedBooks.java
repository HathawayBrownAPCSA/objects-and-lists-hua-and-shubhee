/**
 * Creates a list of borrowed books
 *
 * @author Hua and Shubhee
 * @version 20210927
 */

import java.util.ArrayList;

public class BorrowedBooks
{
    ArrayList<Book> bookList;
    
    /**
     * Constructor initializes a list of Books.
     */
    public BorrowedBooks()
    {
        bookList = new ArrayList<Book>();
    }
    
    /**
     * Adds Books to the list
     * @param i Book that user inputs into the system
     */
    public void addBook (Book i)
    {
        bookList.add(i);
    }
    
    /**
     * Prints the list of borrowed books, and a message about returning them
     */
    public void printBorrowedBooks()
    {
        System.out.println("Here is a list of books you have borrowed: ");
        for (Book book : bookList)
        {
            System.out.println(book);
        }
        System.out.print("\n");
        System.out.println("Remember to return your books in two weeks! Have a nice day!");
    }
    
    /**
     * Verifies that author is on the list
     * @param a The author of the book
     */
    public boolean isAuthor (String a)
    {
        for (Book book : bookList)
        {
            String author = book.getAuthor();
            if(a.equalsIgnoreCase(author))
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Gets the book written by the author
     * @param a The author of the book
     * @return The book written by the input author
     */
    public Book getBookOfAuthor(String a)
    {
        for(Book book : bookList)
        {
            if(book.getAuthor().equalsIgnoreCase(a)){
                return book;
            }
        }
        return null;
    }
    
    /**
     * Verifies that book is on the list
     * @param a The title of the book
     */
    public boolean isBook (String a)
    {
        for (Book book : bookList)
        {
            String title = book.getTitle();
            if(a.equalsIgnoreCase(title))
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Gets the book with input title
     * @param a The title of the book
     * @return The book with the input title
     */
    public Book getBookOfTitle (String a)
    {
        for(Book book : bookList)
        {
            if(book.getTitle().equalsIgnoreCase(a)){
                return book;
            }
        }
        return null;
    }
}
