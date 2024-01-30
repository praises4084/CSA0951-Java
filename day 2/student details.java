import java.util.Scanner;
public class StudentDetails
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int totalStudents = 0;
        int totalPass = 0;
        System.out.print("Enter the total number of students: ");
        int totalNumberOfStudents = s.nextInt();
        
        s.nextLine();
        for (int i = 0; i < totalNumberOfStudents; i++)
        {
            System.out.println("Student " + (i + 1) + " details:");
            System.out.print("Enter Register Number: ");
            int registerNumber = s.nextInt();
            
            s.nextLine();
            System.out.print("Enter Name: ");
            
            String name = s.nextLine();
            System.out.print("Enter Result (Pass/Fail): ");
            
            String result = s.nextLine();
            System.out.print("Enter Grade: ");
            
            char grade = s.next().charAt(0);
            s.nextLine();
            System.out.println("\nStudent Details:");
            System.out.println("Register Number:" + registerNumber);
            System.out.println("Name: " + name);
            System.out.println("Result: " + result);
            System.out.println("Grade: " + grade);
            if (result.equalsIgnoreCase("Pass")) {
                totalPass++;
            }
            totalStudents++;
            System.out.println("\n-------------------------------");
        }
        double passPercentage = (double) totalPass / totalStudents * 100;
        System.out.println("Total Pass Percentage in Class: " + passPercentage + "%");
        s.close();
    }
}