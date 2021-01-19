import java.util.*;
public class Sales {
    static Scanner input=new Scanner(System.in);
    double item;
    double amount;
    double discount;
    
    Sales(double t) {
        item=t;
    }
    public double getTotal(int op) {
        if (op==1)
        {
            System.out.println("Enter number of discount: ");
            discount=input.nextDouble();
            return item*60.5-discount;
        }
        else if (op==2)
        {
            return item*60.5;
        }
        return 0;
    } 
    public static void main(String[] args) {
        
        double item,amount;
        int ops;
        System.out.println("Enter number of items purchased: ");
        item=input.nextDouble();
        System.out.println("Is there a discount\n1.Yes\n2.No");
        ops=input.nextInt();
        Sales total=new Sales(item);
        System.out.println("Total amount to be paid is "+total.getTotal(ops));
    }
    
}   
            
    

