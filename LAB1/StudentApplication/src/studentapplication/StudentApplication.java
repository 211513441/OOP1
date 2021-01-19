
package studentapplication;

public class StudentApplication {

    
    public static void main(String[] args) {
        
      Student s=new Student();                 // Creating Student object
      Student s1=new Student(1,"Abdullah",3,"Cs");
      System.out.println(s.student_Name);      // Calling to student class
      System.out.println(s1.student_Name);
      
    }
}
