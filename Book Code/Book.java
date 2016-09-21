/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book
{
    private String ISBN;

    private String title;

    public Book (String userTitle, String userISBN)
    {
        ISBN = userISBN;
        title = userTitle;
    }

    public void print()
    {
        System.out.println ("Book title is" + " " + title);
        System.out.println ("ISBN number is" + " " + ISBN);
        System.out.println ( );
    }
}
