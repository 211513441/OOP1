import java.util.*;
public class Amount {
   static Scanner input=new Scanner(System.in);
    double item;
    double discount;
    int number;
    
    public Amount(int t) {
        item=t;
    }
    
    public double getTotal() {
        return item*60.5;
    }
    
    public double getTotal(int op) {
        if (op==1)
        {
            System.out.println("Enter number of discount: ");
            discount=input.nextInt();
            return item*(60.5)-discount;
            
        }
        else if (op==2) 
        {
            return item*60.5;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int result;
        int ops;
        System.out.print("Enter number of items: ");
        result=input.nextInt();
        
        Amount comp1=new Amount(result);
        System.out.println("total amount is "+comp1.getTotal());
        
        System.out.println("Is there is a discount: \n1.yes\n2.no");
        ops=input.nextInt();
        System.out.println("Total to be paid is: "+comp1.getTotal(ops));
        
        
        
    }
    
}
