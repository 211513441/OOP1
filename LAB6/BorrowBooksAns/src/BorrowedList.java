import java.util.*;
public class BorrowedList {
    private static ArrayList<Book> book_list=new ArrayList<Book>();
    private static ArrayList<Borrower> borrower_list=new ArrayList<Borrower>();
    
    private static Scanner input=new Scanner(System.in);
    private static Book book;
    private static Borrower borrow;
    
    private static Book addBook(int id,String title,String author,String publisher,String date) {
        book=new Book(id,title,author,publisher,date);
        return book;    
    }
    private static Borrower addBorrower(int id,String name,String address,String contact) {
        borrow=new Borrower(id,name,address,contact);
        return borrow;
    }
    
    private static void addToList(Book newBook,Borrower newBorrower) {
        book_list.add(newBook);
        borrower_list.add(newBorrower);
    }
    // Declare a method to view all books information and borrowers information in the arrayList at the same time
    private static void viewBookBorrower() {
        for (Book book: book_list) {
            System.out.println("Book ID is "+book.getId());
            System.out.println("Book title is "+book.getTitle());
            System.out.println("Book author is "+book.getAuthor());
            System.out.println("Book publisher is "+book.getPublisher());
            System.out.println("Book date is "+book.getDate());
            System.out.println();
        }
        
        for (Borrower borrow: borrower_list) {
            System.out.println("Borrower ID is "+borrow.getId());
            System.out.println("Borrower name is "+borrow.getName());
            System.out.println("Borrower address is "+borrow.getAddress());
            System.out.println("Borrower contact_number is "+borrow.getContactNumber());
            System.out.println();
        }  
    }
    
    public static void main(String[]args) {
        String title,author,publisher,date,name,address,contact; 
        String menu="Select a number: \n1.Borrow book \n2.View Borrowed List \n3.Exit";
        int id=0,select=0;
        do {
            System.out.println(""+menu);
            select=input.nextInt();
            input.nextLine();
            switch(select) {
                case 1: // Borrow book
                    id++;
                    System.out.println("Enter Book title: ");
                    title=input.next();
                    System.out.println("Enter Book author: ");
                    author=input.next();
                    System.out.println("Enter book publisher: ");
                    publisher=input.next();
                    System.out.println("Enter Book date: ");
                    date=input.next();
                    System.out.println("Enter borrower name: ");
                    name=input.next();
                    System.out.println("Enter Borrower address: ");
                    address=input.next();
                    System.out.println("Enter borrower contact_number: ");
                    contact=input.next();
                    Book newBook=addBook(id,title,author,publisher,date);
                    Borrower newBorrower=addBorrower(id,name,address,contact);
                    addToList(newBook,newBorrower);
                    break;
                    
                case 2: // view book and borrower information
                    viewBookBorrower();
                    break;    
                
                case 3: 
                    System.out.println("Thank you for using this Program!"); break;
            }
        }while(select!=3);
    }
}
