import java.util.*;
public class BasicCalculator {
    double input1;
    double input2;
    double result=0;
    
    public BasicCalculator(double n1,double n2) {        // Constructor
        input1=n1;
        input2=n2;
    }
    public double getResult(int op) {
        if (op==1) {
            return input1+input2;
        }
        else if (op==2){
            return input1-input2;
        }
        else if (op==3) {
            return input1*input2;
        }
        else if (op==4) {
            return input1/input2;
        }
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double value1,value2;
        int ops;
        System.out.print("Enter First number: ");
        value1=input.nextDouble();
        System.out.print("Enter Second number: ");
        value2=input.nextDouble();
        System.out.println("Choose what operation is to be performed: \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        ops=input.nextInt();
        BasicCalculator calc1=new BasicCalculator(value1,value2);
        System.out.println("The result is "+calc1.getResult(ops));
        
        
        
    }
    
}
