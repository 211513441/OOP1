package Borrowing;
import java.util.*;

public class Main {
    //Declaration of objects used in the program
   //ArrayList object for Book List
   private static ArrayList<Book> book_list = new ArrayList<Book>();
   //ArrayList object for Borrower List
   private static ArrayList<Borrower> borrower_list = new ArrayList<Borrower>();
   //object to accept input
   private static Scanner console = new Scanner(System.in);
   //object for Book class
   private static Book book_collection;
   //object for Borrower class
   private static Borrower borrowers;
   
   //id for book and borrower
   private static int bookid =1;
   private static int borrowerid =1; 
   
   //private method to add new book to arraylist
   private static void addBook(String title, String author,String publisher, String date){
       bookid++;
       book_collection = new Book(bookid,title,author,publisher,date);
       book_list.add(book_collection);
   }//end of addBook method
   
   //private method to add new Borrower to arraylist
   private static void addBorrower(String name, String address,String contact){
       borrowerid++;
       borrowers = new Borrower(borrowerid,name,address,contact);
       borrower_list.add(borrowers);
   }//end of addBorrower method
   
   //view all borrowers in the list
   private static void viewBorrowers(){        // print all the information of borrowers //print all the content of borrower_list
    for( Borrower borrow : borrower_list ) {   
        System.out.println("Borrower Name:"+borrow.getName());
        System.out.println("Borrower Address:"+borrow.getAddress());
        System.out.println("Borrower Contact Number:"+borrow.getContactNumber());
        System.out.println("");
    }
  }//end of viewBorrowers method
   
   //view all books in the list
   private static void viewBooks(){     // print all the content of book_list
    for( Book book : book_list ) {   
        System.out.println("Book Title:"+book.getTitle());
        System.out.println("Book Author:"+book.getAuthor());
        System.out.println("Book Publisher:"+book.getPublisher());
        System.out.println("Book Date:"+book.getDate());
        System.out.println("");
  }       
}//end of viewBook method
   
//main method   
public static void main(String[]args){   
    //local variables to accept user input 
    int select;
    String title,author,publisher,date;
    String name,address,contact;
    
    String menu = "Borrowers Menu\n1. Add Book\n2. Add Borrower"
            + "\n3. View Books \n4. View Borrowers \n5. Borrow Book\n6.View Borrowed Books"
            + "\n7.Exit";
    
    //do while statement is used to repeat process
    do{
        System.out.println(menu+"\nSelect a number");
        select = console.nextInt();
        console.nextLine();
        //switch case statement to determine what will the program do
        switch(select){
            case 1://add new book
                //accept use input from the user
               System.out.println("Enter Book Title: ");
               title = console.nextLine();
               System.out.println("Enter Book Author: ");
               author = console.nextLine();
               System.out.println("Enter Book Publisher: ");
               publisher = console.nextLine();
               System.out.println("Enter Book Date: ");
               date = console.nextLine();
               //add book to ArrayList object
               addBook(title,author,publisher,date);
            break;
            
            case 2://add new borrower
                //accept input from the user
               System.out.println("Enter Borrower Name: ");
               name = console.nextLine();
               System.out.println("Enter Borrower Address: ");
               address = console.nextLine();
               System.out.println("Enter Borrower Contact Number: ");
               contact = console.nextLine();
               //add borrower 
               addBorrower(name,address,contact);
            break;
                
            case 3://view books
                viewBooks();
            break;
                
            case 4://view borrowers
                viewBorrowers();
            break;
            
            case 5://borrow books
               
            break;
                
            case 6://view borrowed books
                
            break;
            
            case 7://message before terminating the program
                System.out.printf("Thank you for using the program");
            break;    
            default://error message will be shown if the user input is invalid
                System.out.println("Invalid input Please try again!");
            break;
            
        }//end of switch
        
    }while(select!=7);//terminates the program if the input is 7
   
}//end of main method

}//end of class

