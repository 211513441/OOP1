import java.util.*;
public class PointOfSale {
    static Scanner input=new Scanner(System.in);
    double numItems;
    double amount;
    double discount;
    
    PointOfSale(double item) {
        numItems=item;
    }
    
    public double getAmount() {
        return numItems*60.5;
    }
    public double getTotal(int op) {
        if (op==1) {
            amount=numItems*60.5;
            System.out.println("Enter the discount: ");
            discount=input.nextDouble();
            amount=amount-discount;
            return amount;
        }
        else if (op==2) {
            amount=numItems*60.5;
            amount=amount;
            return amount;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int ops;
        double numItems,amount,discount;
        
        System.out.println("Enter number of items: ");
        numItems=input.nextDouble();
        PointOfSale comp1=new PointOfSale(numItems);
        System.out.println("Total amount is "+comp1.getAmount());
        
        System.out.println("Is there a discount \n1.Yes\n2.No");
        ops=input.nextInt();
        System.out.println("The total amount purchased is "+comp1.getTotal(ops));
    }
    
}
