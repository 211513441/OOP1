package AreaOfCircle;

public class Circle1 {
    double radius;
    Circle1() {                       // Constructor
        radius=1;
    }
    
    Circle1(double newRadius) {       // Constructor
        radius=newRadius;
    }
    
    double getArea() {                        // public double getArea()
        return radius*radius*Math.PI;
    }
    
    public static void main(String[] args) {
    Circle1 circle1=new Circle1();
    System.out.println("The area of the circle of radius "+circle1.radius+" is " +circle1.getArea());
    
    Circle1 circle2=new Circle1(50);   // Calling
    System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
    
    Circle1 circle3=new Circle1(200);  // Calling to constructor Circle1
    System.out.println("The area of the circle of radius "+circle3.radius+" is "+circle3.getArea());
    
    circle2.radius=300;
    System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
    }
    
    
    
    
    
    
    }
