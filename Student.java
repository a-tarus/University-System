import java.util.Scanner;

public class Student extends Person {
    String University;
    String stream;
    int StudentId;
    
    public void getDetail()
    {
        super.getDetail();
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the Academic Details");
        System.out.println("Enter the Course Enrolled");
        stream = input.nextLine();
        System.out.println("Enter the Student ID");
        StudentId = input.nextInt();
        showDetail();
    }
    
    public void showDetail()
    {
    System.out.println("The details entered are: \n");
    System.out.println("First Name: " + super.firstName);
    System.out.println("Last Name: " + super.lastName);
    System.out.println("Age: " + super.age);
    System.out.println("Course Enrolled: " + stream);
    System.out.println("Student ID: " + StudentId);
    }
}
