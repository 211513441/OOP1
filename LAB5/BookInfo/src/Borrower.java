import java.util.*;
public class Borrower {
    String name;
    String address;
    String contact_number;
    
    Borrower(String name,String address,String contact_number) {
        this.name=name;
        this.address=address;
        this.contact_number=contact_number;
    }
    
    public void setName(String n) {
        name=n;
    }
    public void setAddress(String a) {
        address=a;
    }
    public void serContact_number(String c) {
        contact_number=c;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getContact_number() {
        return contact_number;
    }
    
}