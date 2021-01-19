
public class Student {                 // Declaring class Student
    int student_id;
    String student_name;               // Declaring attributes
    int student_year;
    String student_department;
    
    Student(int id,String name,int year,String department) {
        this.student_id=id;
        this.student_name=name;
        this.student_year=year;
        this.student_department=department;        
    }
    
    public int getId() {            // Declaring method
        return student_id;       
    }
    
    public String getName() {       // Declaring method
        return student_name;      
    }
    
    public int getYear() {
        return student_year;      
    }
    
    public String getDepartment() {
        return student_department;       
    }
    
    
}
