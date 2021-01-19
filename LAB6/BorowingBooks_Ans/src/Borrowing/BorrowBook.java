package Borrowing;
import java.util.*;

public class BorrowBook {
    private static ArrayList<Book> book_list = new ArrayList<Book>();
    private static ArrayList<Borrower>borrower_list = new ArrayList<Borrower>();
    static Scanner console = new Scanner(System.in);
    static Book book;
    static Borrower borrower;
    
    private static Book addBook(int id,String title,String author,String publisher,String date){
       book = null;
       book = new Book(id,title,author,publisher,date);
       return book;
    }
    
    private static Borrower addBorrower(int id,String name, String address, String contact){
    borrower = null;
    borrower = new Borrower(id,name,address,contact);
    return borrower;
    }
    
    private static void addToList(Book b,Borrower br){
    book_list.add(b);
    borrower_list.add(br);
    }
    
    private static void viewBorrowedList(){
        for (Book bookview: book_list){
            System.out.println("Book ID: "+bookview.getID());
            System.out.println("Book Title: "+bookview.getTitle());
            System.out.println("Book Author: "+bookview.getAuthor());
            System.out.println("Book Publisher: "+bookview.getPublisher());
            System.out.println("Book Date: "+bookview.getDate());
            System.out.println();
        }
        
        for (Borrower borrowerview: borrower_list){
            System.out.println("Borrower Id: "+borrowerview.getID());
            System.out.println("Borrower Name: "+borrowerview.getName());
            System.out.println("Borrower Address: "+borrowerview.getAddress());
            System.out.println("Borrower Contact number: "+borrowerview.getContactNumber());
            System.out.println();
        }
        
    }
    
    public static void main(String[]args){
    String menu = "Select a number: \n1. Borrow Book \n2. View Borrowed List \n3.Exit";
    int id= 0;
    String title,author,publisher,date;
    String name,address,contact;
    int choice=0;
    do{
        System.out.println(""+menu);
        choice = console.nextInt();
        console.nextLine();
        switch(choice){
            case 1:
                id++;
                System.out.println("Enter Book Title: ");
                title = console.nextLine();
                System.out.println("Enter Book author: ");
                author = console.nextLine();
                System.out.println("Enter Book Publisher: ");
                publisher = console.nextLine();
                System.out.println("Enter Book date: ");
                date = console.nextLine();
                System.out.println("Enter Borrower Name: ");
                name = console.nextLine();
                System.out.println("Enter Borrower address: ");
                address = console.nextLine();
                System.out.println("Enter Borrower Contact Number: ");
                contact = console.nextLine();
                Book newbook = addBook(id,title,author,publisher,date);
                Borrower newborrower = addBorrower(id,name,address,contact);
                addToList(newbook,newborrower);
                
            break;
                
            case 2:
                viewBorrowedList();
            break;
        
        }
               
    }while(choice!=3);
    
    
    
    }
}
