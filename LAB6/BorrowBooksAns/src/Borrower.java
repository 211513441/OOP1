
public class Borrower {
    private int id;
    private String name;
    private String address;
    private String contact_number;
    
public Borrower(int i,String n,String a,String c) {
    this.id=i;
    this.name=n;
    this.address=a;
    this.contact_number=c;
}    

public void setName(String n) {
    name=n;
}
public void setAddress(String a) {
    address=a;
}
public void setContact_number(String c) {
    contact_number=c;
}

public int getId() {
    return id;
}
public String getName() {
    return name;
}
public String getAddress() {
    return address;
}
public String getContactNumber(){
    return contact_number;
}
    
}
