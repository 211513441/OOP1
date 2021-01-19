import java.util.*;

public class Students_Records {
    ArrayList<Student> list=new ArrayList<Student>();         // Creating an empty ArrayList for student class
    public static void main(String[] args) {
        new Students_Records();                // declaring object Students_Records()                      
    }
    public Students_Records() {                   // Constructor
        Scanner input=new Scanner(System.in); 
        for (int i=0;i<3;i++)
        {
            System.out.print("Enter Student_Id: ");
            int id=input.nextInt();
            System.out.print("Enter Student_Name: ");
            String name=input.next();
            System.out.print("Enter Student_Year: ");
            int year=input.nextInt();
            System.out.print("Enter Student_Department: ");
            String department=input.next();
               list.add(new Student(id,name,year,department));  // add student class to ArrayList            
        }
        for (int j=0;j<3;j++)                                  // Display the content of ArrayList 
        {
            System.out.print(" "+list.get(j).getId());     // Calling to student.java
            System.out.print(" "+list.get(j).getName());
            System.out.print(" "+list.get(j).getYear());
            System.out.print(" "+list.get(j).getDepartment());
            System.out.println(" ");      
        }
         //System.out.printf("%s %3s %3s %3s\n","Id","Name","Year","Department");    
    }
            
    
    
}
