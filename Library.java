/**
 * Tests the book class
 *
 * @author Hua and Shubhee
 * @version 20210927
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Library
{
    public static void main (String[] args)
    {
          Scanner kbd = new Scanner(System.in);
          Genre genreList = new Genre();
          int numBooks;
          BorrowedBooks bookList = new BorrowedBooks();
          
          
          //Number of books being borrowed
          System.out.print("How many books would you like to borrow?: ");
          numBooks = kbd.nextInt();
          numBooks -= 1;
          
          String dummy = kbd.nextLine();
          
          for(int i = 0; i <= numBooks; i++)
          {
              //Information about the book
              System.out.print("Title: ");
              String title = kbd.nextLine();
              
              System.out.print("Author: ");
              String author = kbd.nextLine();
              
              System.out.print("Please put a genre in (case sensitive): ");
              genreList.printGenres();
              String genre = kbd.nextLine();
              
              System.out.print("Page count: ");
              int pages = kbd.nextInt();
              
              dummy = kbd.nextLine(); //clears the input line
              
              //Construct a new item
              bookList.addBook (new Book(title, author, genre, pages));
            }
          
          //Prints a list of books being borrowed
          System.out.print("\n");
          bookList.printBorrowedBooks();
          
          //Get info about books
          System.out.println("Would you like to know any information about the books you borrowed?");
          String info = kbd.nextLine();
          boolean wantsInfo;
         if (info.equalsIgnoreCase("yes"))
          {
              wantsInfo = true;
            }
            else 
            {
                wantsInfo = false;
            }
          if (wantsInfo = true)
          {
          System.out.println("Would you like to search by title or author? Type t for title and a for author ");
          String aOrt = kbd.nextLine();
          if (aOrt.equalsIgnoreCase("a") || aOrt.equalsIgnoreCase("author")){
                  System.out.println("Check borrowed books for this title: ");
                  String desiredTitle = kbd.nextLine();
                  boolean isBook = bookList.isBook(desiredTitle);
                  if(isBook)
                  {
                      System.out.println("The bookshelf contains a book: " + bookList.getBookOfTitle(desiredTitle));
                    }
                }
          else if (aOrt.equalsIgnoreCase("t") || aOrt.equalsIgnoreCase("title")){
                  System.out.println("Check borrowed books for this author: ");
                  String desiredAuthor = kbd.nextLine();
                  boolean isAuthor = bookList.isAuthor(desiredAuthor);
                  if(isAuthor)
                  {
                      System.out.println("The bookshelf contains a work by this author: " + bookList.getBookOfAuthor(desiredAuthor));
                    }
            }
          else
          {
            kbd.close();
            }
        }
    }
}
