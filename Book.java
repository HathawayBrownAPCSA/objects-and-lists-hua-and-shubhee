
/**
 * Books
 *
 * @author Hua and Shubhee
 * @version 20210920
 */

public class Book
{
    // attributes of a book
    private String title;
    private int pages;
    private String genre;
    private Genre genreList = new Genre();
    private String author;

    /**
     * Constructor initializes values for title, author, page count, and genre
     * Also checks if the genre is on the list of genres or not.
     * 
     * @param t Title of book
     * @ param a Author of book
     * @param num Page count of book (integer)
     * @param g Genre of book
     * 
     */
    public Book(String t, String a, String g, int num)
    {
        // initialise instance variables
        title = t;
        pages = num;
        if(genreList.isValidGenre(g))
        {
            genre = g;
        }
        author = a;
    }
    
    /**
     * Returns user input about the Book
     * 
     * @return the title, author, and genre as a string
     * 
     */
    public String toString()
    {
       return title + " by " + author + ", " + genre;
    }
    
    /**
     * Returns title of Book
     * @return title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Returns author of Book
     * @return author
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Returns genre of Book
     * @return genre
     */
    public String getGenre()
    {
        return genre;
    }
    
    /**
     * Updates genre
     * @param newGenre The new genre of the Book
     */
    public void setGenre(String newGenre)
    {
        genre = newGenre;
    }
}
