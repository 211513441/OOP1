package Borrowing;
import java.util.*;

public class BorrowedList {
    
    static ArrayList<Book> borrowedBook_list=new ArrayList<Book>();
    static ArrayList<Borrower> borrowers_list=new ArrayList<Borrower>();
    
    private static void addBookBorrower(Book book,Borrower borrow) {
        borrowedBook_list.add(book);
        borrowers_list.add(borrow);
    }
    
    
    public static void viewBookBorrower() {    // diplay borrower information
        for (Borrower borrow: borrowers_list) {
            System.out.println("Borrower Name: "+borrow.getName());
            System.out.println("Borrower Address: "+borrow.getAddress());
            System.out.println("Borrower Contact_number: "+borrow.getContactNumber()); 
            System.out.println();
        }
        for (Book book: borrowedBook_list) {    // display borrowed book information
            System.out.println("Borrowed Book Title: "+book.getTitle());
            System.out.println("Borrowed Book Author: "+book.getAuthor());
            System.out.println("Borrowed Book Publisher: "+book.getPublisher());
            System.out.println("Borrowed Book Date: "+book.getDate());
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String title,author,publisher,date,name,address,contact;
        int select,id=0;
        
        do {
            System.out.println("Select a number: \n1. Borrow Book \n2. View Borrowed List \n3. Exit");
            select=input.nextInt();
            
            switch(select) {
                case 1:
                   id++;
                   System.out.println("Enter Book Title: ");
                   title = input.next();
                   System.out.println("Enter Book author: ");
                   author = input.next();
                   System.out.println("Enter Book Publisher: ");
                   publisher = input.next();
                   System.out.println("Enter Book date: ");
                   date = input.next();
                   System.out.println("Enter Borrower Name: ");
                   name = input.next();
                   System.out.println("Enter Borrower address: ");
                   address = input.next();
                   System.out.println("Enter Borrower Contact Number: ");
                   contact = input.next();
                   Book book=new Book(id,title,author,publisher,date); 
                   Borrower borrow=new Borrower(id,name,address,contact);  
                   addBookBorrower(book,borrow);
                break;
                
                case 2:
                    viewBookBorrower();
                    break;
                    
                case 3:
                    System.out.println("Program Terminated!"); break;
                    
                default: 
                    System.out.println("Invalid input please Try again!!\n");
            }
        }while(select!=3);
    }
    
    
    /*
    
    Your for this class
    1. declare arraylist objects as attributes for this class
        a. Arraylist for borrowed book
        b. Arraylist for Borrwers
    2. Methods
        a. Method to store borrowed book in the Arraylist from the Book class
        b. Method to store borrower information to Arrayist from the Borrower Class
        c. Method to diplay the borrower information and Borrowed book 
        information at the same time.
    
    Note : Only one book can be borrowed by a borrower.
    */
    
    
    
    
    
}
