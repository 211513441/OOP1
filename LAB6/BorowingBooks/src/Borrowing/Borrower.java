package Borrowing;

public class Borrower {
    private int id;
    private String name;
    private String address;
    private String contact_number;
    
    public Borrower(int id, String name,String address,String contact_number){
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact_number = contact_number;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setContactNumber(String contact_number){
        this.contact_number = contact_number;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public String getContactNumber(){
        return this.contact_number;
    }
}
