import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name of the Student: ");
        String Name = sc.nextLine();
        System.out.print("Enter Number of Subjects: ");
        int noOfSubjects = sc.nextInt();
        int totalMarks = 0;
        for(int i=1 ; i<=noOfSubjects ; i++){
            System.out.print("Enter marks obtained in subject "+i+": ");
            int marks = sc.nextInt();
            System.out.print("Subject "+i+": ");
            String subject = sc.nextLine();
            sc.nextLine();
            totalMarks += marks;
        }
        double averagePercentage = (double) totalMarks / noOfSubjects;
        String grade;
        if(averagePercentage >= 90){
            grade = "S";
        }
        else if(averagePercentage >= 80){
            grade = "A";
        }
        else if(averagePercentage >= 70){
            grade = "B";
        }
        else if(averagePercentage >= 60){
            grade = "C";
        }
        else if(averagePercentage >= 50){
            grade = "D";
        }
        else{
            grade = "E";
        }
        System.out.println("Student Name: "+Name);
        System.out.println("Total marks: "+totalMarks);
        System.out.println("Average Percentage: "+averagePercentage );
        System.out.println("Grade: "+grade);
        sc.close();
    }
}

