
public class WaterCalculator {
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
        WaterCalculator rectvolume=new WaterCalculator(10,5,4);
        System.out.println("Volume of rectangular shape of the swimming pool is "+rectvolume.getVolume());
        WaterCalculator squarevolume=new WaterCalculator(6,2,9);
        System.out.println("Volume of square shape of the swimming pool is "+squarevolume.getVolume());
        WaterCalculator ovalvolume=new WaterCalculator(5,3,8);
        System.out.println("Volume of oval shape of the swimming pool is "+ovalvolume.getVolume());
        WaterCalculator circvolume=new WaterCalculator(7,5);
        System.out.println("Volume of Circular shape of the swimming pool is "+circvolume.getCircularVolume());
        
    }
    
}
