import java.util.*;
public class Calculator {
    static Scanner input=new Scanner(System.in);
    double length;
    double width;
    double depth;
    double radius;
    
    Calculator(double L,double W,double D) {
        length=L;
        width=W;
        depth=D;   
    }
    
    Calculator(double R,double D) {
        radius=R;
        depth=D;
    }
    
    public double getVolume() {
        return length*width*depth*7.5;    
}
    public double getCircularVolume() {
        return 3.14*radius*depth*7.5;
    }
    
public static void main(String[] args) {
    double length,width,depth,radius; int ops;
    System.out.println("Choose the shape of swimming pool (1.square shape,2.rectangular shape,3.Oval shape,4.Circular shape): ");
    ops=input.nextInt();
    switch(ops) {
        case 1: case 2: case 3:
            System.out.print("Enter the length of swimming pool: ");
            length=input.nextDouble();
            System.out.print("Enter the width of swimming pool: ");
            width=input.nextDouble();
            System.out.print("Enter the depth of swimming pool: ");
            depth=input.nextDouble();
            Calculator rectvolume=new Calculator(length,width,depth);
            System.out.println("The volume of square/Rectangular/oval shape swimming pool is "+rectvolume.getVolume());
            break;
        case 4:
             System.out.print("Enter the radius of swimming pool: ");
             radius=input.nextDouble();
             System.out.print("Enter the depth of swimming pool: ");
             depth=input.nextDouble();
             Calculator circvolume=new Calculator(radius,depth);
             System.out.println("The volume of Circular shape swimming pool is "+circvolume.getCircularVolume());
             break;
        default: 
            System.out.println("Error. Invalid input!!");
            
        
    }
   
   
   
    
    
}
        
   
    
}

    

