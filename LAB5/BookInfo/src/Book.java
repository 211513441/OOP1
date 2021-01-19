
public class Book {
    private String title; 
    private String author;
    private String publisher;
    private String date;
    
    public Book(String title,String author,String publisher,String date){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.date =date;
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

    

