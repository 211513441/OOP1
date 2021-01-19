import java.util.*;
public class Book {
    static Scanner input=new Scanner(System.in);
    String book_title;
    String author;
    String publisher;
    String date_published;
    
    Book(String title,String author,String publisher,String date) {
        this.book_title=title;
        this.author=author;
        this.publisher=publisher;
        this.date_published=date;
    }
    
    public void setBookTitle(String title) {
        book_title=title;
    }
    public String getBookTitle() {
        return book_title;
    }
    public void setAuthor(String author) {
        author=author;
    }
    public String getAuthor() {
        return author;
    }
    public void setPublisher(String publisher) {
        publisher=publisher;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setDatePublished(String date) {
        date_published=date;    
    }
    public String getDatePublished() {
        return date_published;
    }
   public static void main(String[] args) {
       String title;
       String author;
       String publisher;
       String date;
       System.out.println("Enter book_title: ");
       title=input.next();
       System.out.println("Enter the author of book: ");
       author=input.next();
       System.err.println("Enter the publisher of book: ");
       publisher=input.next();
       System.out.println("Enter the date published: ");
       date=input.next();
       Book info= new Book(title,author,publisher,date);
       System.out.println("Book title is "+info.getBookTitle());
       System.out.println("Book author is "+info.getAuthor());
       System.out.println("Book publisher is "+info.getPublisher());
       System.out.println("Date_published of book is "+info.getDatePublished());
       
       
       
   } 
    
    
}
