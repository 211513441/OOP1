import java.util.*;
public class StudentRegistration {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        StudentInformation[] studentInfo=new StudentInformation[5];
        for (int i=0;i<2;i++) {
            studentInfo[i]=new StudentInformation();
            System.out.print("Enter Student Id: ");
            studentInfo[i].setId(input.nextInt());
            System.out.print("Enter Student name: ");
            studentInfo[i].setName(input.next());           
            System.out.print("Enter Student Birthdate: ");
            studentInfo[i].setBirthdate(input.nextInt());
             System.out.print("Enter Student Address: ");
            studentInfo[i].setAddress(input.next());
            System.out.print("Enter Student Course: ");
            studentInfo[i].setCourse(input.next());
            System.out.print("Enter Student Year: ");
            studentInfo[i].setYear(input.nextInt());
            System.out.print("Enter Student Contact Number: ");
            studentInfo[i].setContact_number(input.nextInt());
             System.out.print("Enter Student Email Address: ");
            studentInfo[i].setEmail_address(input.next());
        }
        for (int j=0;j<2;j++) {
            System.out.print(" "+studentInfo[j].getId());
            System.out.print(" "+studentInfo[j].getName());
            System.out.print(" "+studentInfo[j].getBirthdate());
            System.out.print(" "+studentInfo[j].getAddress());
            System.out.print(" "+studentInfo[j].getCourse());
            System.out.print(" "+studentInfo[j].getYear());
            System.out.print(" "+studentInfo[j].getContact_number());
            System.out.print(" "+studentInfo[j].getEmail_address());
            System.out.println();
        }
        
    }
}
    