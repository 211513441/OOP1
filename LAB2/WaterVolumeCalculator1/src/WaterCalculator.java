import java.util.*;
public class WaterCalculator {
    static Scanner input=new Scanner(System.in);
    double length;
    double width;
    double depth;
    double radius;
    
    WaterCalculator(double L,double W,double D) {
        length=L;
        width=W;
        depth=D;   
    }
    
    WaterCalculator(double R,double D) {
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
    double length,width,depth,radius;
    System.out.print("Enter the length of swimming pool: ");
    length=input.nextDouble();
    System.out.print("Enter the width of swimming pool: ");
    width=input.nextDouble();
    System.out.print("Enter the depth of swimming pool: ");
    depth=input.nextDouble();
    System.out.print("Enter the radius of swimming pool: ");
    radius=input.nextDouble();
    WaterCalculator rectvolume=new WaterCalculator(length,width,depth);
    WaterCalculator circvolume=new WaterCalculator(radius,depth);
    System.out.println("The volume of square/Rectangular/oval shape swimming pool is "+rectvolume.getVolume());
    System.out.println("The volume of Circular shape swimming pool is "+circvolume.getCircularVolume());
    
}
        
   
    
}
