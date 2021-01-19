import java.util.*;

public class Main {  
   private static ArrayList<Book> list1;              // You can delete these two lines and replace them with
   private static ArrayList<Borrower> list2;      // Declaring object list2 for Borrower class
   
public static void main(String[]args){
    Scanner console = new Scanner(System.in);
    String title,author,publisher,date;       
    list1 = new ArrayList<Book>();                     // ArrayList<Book> list=new ArrayList<Book>();
    
    System.out.println("Enter Book Title: ");
    title = console.next();
    System.out.println("Enter Book Author: ");
    author = console.next();
    System.out.println("Enter Book Publisher: ");
    publisher = console.next();
    System.out.println("Enter Book Date: ");
    date = console.next();
    Book book_collection = new Book(title,author,publisher,date);
    list1.add(book_collection);
   
    
        String name,address,contact_number;
    
        list2=new ArrayList<Borrower>();               // ArrayList<Borrower> list2=new ArrayList<Borrower>();
        System.out.print("Enter Borrower name: ");
        name=console.next();
        System.out.print("Enter Borrower address: ");
        address=console.next();
        System.out.print("Enter Borrower contact_number: ");
        contact_number=console.next();
        Borrower info=new Borrower(name,address,contact_number);
        list2.add(info);
        
        for (Borrower b:list2) {
            System.out.println("Borrower name is "+b.getName());
            System.out.println("Borrower address is "+b.getAddress());
            System.out.println("Borrower contact_number is "+b.getContact_number());
            
        }
       

 for( Book book : list1 ) {
    System.out.println("Book Title is "+book.getTitle());
    System.out.println("Book Author is "+book.getAuthor());
    System.out.println("Book Publisher is "+book.getPublisher());
    System.out.println("Book Date is "+book.getDate());
    System.out.println("");
  }       
}      
}
