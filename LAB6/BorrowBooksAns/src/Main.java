import java.util.*;
public class Main {
    private static ArrayList<Book> book_list=new ArrayList<Book>();
    private static ArrayList<Borrower> borrower_list=new ArrayList<Borrower>();
    private static Scanner input=new Scanner(System.in);
    
    private static Book book_collection;
    private static Borrower borrowers;
    
    private static int bookid=0;
    private static int borrowerid=0;
    
    /*  private static void addBook(Book book) {             // You can use these two methods instead of two methods below
           book_list.add(book);                                
    }                                                           
        private static void addBorrower(Borrower borrow) {
          borrower_list.add(borrow);   
     }                                                           */
    
    private static void addBook(String title,String author,String publisher,String date) {   // add new Book to ArrayList
        bookid++;
        book_collection=new Book(bookid,title,author,publisher,date);
        book_list.add(book_collection);
    }
     //declare a method to add new Borrower to ArrayList
    private static void addBorrower(String name,String address,String contact) {
        borrowerid++;
        borrowers=new Borrower(borrowerid,name,address,contact);
        borrower_list.add(borrowers);
    }
    // Declare a method to view all books in the arrayList
    private static void viewBooks() {
        for (Book book: book_list) {
            System.out.println("Book title is "+book.getTitle());
            System.out.println("Book author is "+book.getAuthor());
            System.out.println("Book publisher is "+book.getPublisher());
            System.out.println("Book date is "+book.getDate());
            System.out.println();
        }
    }
    // Declare a method to view all the borrowers in the arrayList
    private static void viewBorrowers() {
        for (Borrower borrow: borrower_list) {
            System.out.println("Borrower name is "+borrow.getName());
            System.out.println("Borrower address is "+borrow.getAddress());
            System.out.println("Borrower contact_number is "+borrow.getContactNumber());
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int select,id=0;
        String title,author,publisher,date,name,address,contact;
        String menu="Borrowers Menu \n1.Add Book \n2.Add Borrower"+"\n3.View Books \n4.View Borrowers "
                + "\n5.Borrow Book \n6.View Borrowed Books\n7.Exit";
        do {
            System.out.println(menu+"\nSelect a number");
            select=input.nextInt();
            input.nextLine();
            
            switch(select) {
                case 1: // Add new Book
                    System.out.println("Enter book title: ");
                    title=input.next();
                    System.out.println("Enter book author: ");
                    author=input.next();
                    System.out.println("Enter Book publisher: ");
                    publisher=input.next();
                    System.out.println("Enter Book date: ");
                    date=input.next();
                    addBook(title,author,publisher,date);
                    // Book b=new Book(id,title,author,publisher,date);
                    // addBook(b);
                    break;
                
                case 2: // Add new Borrower
                    System.out.println("Enter Borrower name: ");
                    name=input.next();
                    System.out.println("Enter Borrower address: ");
                    address=input.next();
                    System.out.println("Enter Borrower contact_number: ");
                    contact=input.next();
                    addBorrower(name,address,contact);
                     // Borrower borrow=new Borrower(id,name,address,contact);
                     // addBorrower(borrow);
                    break;
                    
                case 3: // View books
                    viewBooks();
                    break;
                
                case 4: // View Borrowers
                    viewBorrowers();
                    break;
                    
                case 5: // Borrow books
                    break;
                    
                case 6: // view Borrowed books
                    
                case 7: // Exit
                    System.out.println("Thank for using this program"); break;
                default: 
                    System.out.println("Error invalid input Try Again!"); break;
            }  
        }while(select!=7);                 
                    
                    
            
            
        
    }
   
  
    
    
    
}
    
    