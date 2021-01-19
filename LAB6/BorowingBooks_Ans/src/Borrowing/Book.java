/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Borrowing;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private String date;
    
    public Book(int id,String title,String author,String publisher,String date){
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.date =date;
    }
    
    public int getID(){
        return this.id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    public String getTitle(){
        return this.title;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getPublisher(){
        return this.publisher;
    }
    
    public String getDate(){
        return this.date;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    
    public void setDate(String date){
        this.date = date;
    }
       
}

