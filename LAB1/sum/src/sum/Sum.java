
package sum;

import java.util.Scanner;
public class Sum {

    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);  
       int x,y,sum;
       System.out.println("Enter 2 numbers: ");
       x=input.nextInt();
       y=input.nextInt();
     
       sum=x+y;
       System.out.println("Sum="+sum);
      
    }
}
