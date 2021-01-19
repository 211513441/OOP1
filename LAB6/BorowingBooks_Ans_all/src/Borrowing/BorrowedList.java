/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Borrowing;
import java.util.*;

public class BorrowedList {
    private static ArrayList<Book> book_list = new ArrayList<Book>();
    private static ArrayList<Borrower> borrower_list = new ArrayList<Borrower>();
    
    public void borrowBook(Book book,Borrower borrower){
        book_list.add(book);
        borrower_list.add(borrower);
    }
    
    public void viewBorrowedBooks(){
        System.out.println("Borrower Information\n");
        for( Borrower borrow : borrower_list ) {
            System.out.println("Borrower Name:"+borrow.getName());
            System.out.println("Borrower Address:"+borrow.getAddress());
            System.out.println("Borrower Contact Number:"+borrow.getContactNumber());
            System.out.println("");
        }
        
        System.out.println("Book Borrowed\n");
        for( Book book : book_list ) {
            System.out.println("Book Title:"+book.getID());
            System.out.println("Book Title:"+book.getTitle());
            System.out.println("Book Author:"+book.getAuthor());
            System.out.println("Book Publisher:"+book.getTitle());
            System.out.println("Book Date:"+book.getDate());
            System.out.println("");
        }     
    }
    
    
}
