import java.util.*;
public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private String date;
    
public Book(int i,String t,String a,String p,String d) {
    this.id=i;
    this.title=t;
    this.author=a;
    this.publisher=p;
    this.date=d;
}    

public void setId(int i) {
    id=i;
}
public void setTitle(String t) {
    title=t;
}
public void setAuthor(String a) {
    author=a;
}
public void setPublisher(String p) {
    publisher=p;
}
public void setDate(String d) {
    date=d;
}

public int getId() {
    return id;
}
public String getTitle(){
    return title;
}
public String getAuthor() {
    return author;
}
public String getPublisher() {
    return publisher;
}
public String getDate() {
    return date;
}

public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String title,author,publisher,date; int id=0;
    System.out.println("Enter Book title: ");
    title=input.next();
    System.out.println("Enter Book author: ");
    author=input.next();
    System.out.println("Enter Book publisher: ");
    publisher=input.next();
    System.out.println("Enter Book date published: ");
    date=input.next();
    Book info=new Book(id,title,author,publisher,date);
    
    //info.setTitle("asd");
   // info.setTitle(input.next());
    System.out.println("Book title is "+info.getTitle());
    System.out.println("Book Author is "+info.getAuthor());
    System.out.println("Book publisher is "+info.getPublisher());
    System.out.println("Book Date published is "+info.getDate());
}
    
}
