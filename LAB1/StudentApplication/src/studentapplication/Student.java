
package studentapplication;

public class Student {
    int student_id;     // declaring class attributes
    String student_Name;
    int student_year;
    String student_Department;
    //Constructor without arguments
    Student() {          
    }
    Student(int id,String name,int year,String department) {    // Constrictor to assign values to class variables
        this.student_id=id;
        this.student_Name=name;
        this.student_year=year;
        this.student_Department=department;
    }
    
}
