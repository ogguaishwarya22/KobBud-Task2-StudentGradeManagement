import java.util.Scanner;

// Student Class
class Student {

    // Variables
    String studentName;
    int rollNumber;

    int subject1Marks;
    int subject2Marks;
    int subject3Marks;

    int totalMarks;
    double averageMarks;

    char grade;
    String result;

    // Method to input student details
    void inputStudentDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================================");
        System.out.println("         STUDENT GRADE MANAGEMENT SYSTEM");
        System.out.println("====================================================");

        System.out.print("Enter Student Name               : ");
        studentName = sc.nextLine();

        System.out.print("Enter Roll Number                : ");
        rollNumber = sc.nextInt();

        System.out.print("Enter Marks in Subject 1         : ");
        subject1Marks = sc.nextInt();

        System.out.print("Enter Marks in Subject 2         : ");
        subject2Marks = sc.nextInt();

        System.out.print("Enter Marks in Subject 3         : ");
        subject3Marks = sc.nextInt();

        // Validation
        if (subject1Marks > 100 || subject2Marks > 100 || subject3Marks > 100) {

            System.out.println("\nMarks should not exceed 100!");
            System.exit(0);
        }

        if (subject1Marks < 0 || subject2Marks < 0 || subject3Marks < 0) {

            System.out.println("\nMarks cannot be negative!");
            System.exit(0);
        }
    }

    // Method to calculate total marks
    void calculateTotalMarks() {

        totalMarks = subject1Marks + subject2Marks + subject3Marks;
    }

    // Method to calculate average marks
    void calculateAverageMarks() {

        averageMarks = totalMarks / 3.0;
    }

    // Method to calculate grade
    void calculateGrade() {

        if (averageMarks >= 90) {

            grade = 'A';
        }
        else if (averageMarks >= 75) {

            grade = 'B';
        }
        else if (averageMarks >= 60) {

            grade = 'C';
        }
        else if (averageMarks >= 40) {

            grade = 'D';
        }
        else {

            grade = 'F';
        }
    }

    // Method to calculate pass/fail result
    void calculateResult() {

        if (grade == 'F') {

            result = "FAIL";
        }
        else {

            result = "PASS";
        }
    }

    // Method to display topper message
    void displayPerformanceMessage() {

        System.out.println("\n====================================================");

        if (grade == 'A') {

            System.out.println("Outstanding Performance!");
            System.out.println("Keep up the excellent work.");
        }
        else if (grade == 'B') {

            System.out.println("Very Good Performance!");
            System.out.println("You are doing really well.");
        }
        else if (grade == 'C') {

            System.out.println("Good Performance!");
            System.out.println("You can improve even more.");
        }
        else if (grade == 'D') {

            System.out.println("Average Performance!");
            System.out.println("Need more practice.");
        }
        else {

            System.out.println("Poor Performance!");
            System.out.println("Work hard and improve.");
        }

        System.out.println("====================================================");
    }

    // Method to display report card
    void displayReportCard() {

        System.out.println("\n");
        System.out.println("====================================================");
        System.out.println("                 STUDENT REPORT CARD");
        System.out.println("====================================================");

        System.out.println("Student Name                    : " + studentName);
        System.out.println("Roll Number                     : " + rollNumber);

        System.out.println("----------------------------------------------------");

        System.out.println("Subject 1 Marks                 : " + subject1Marks);
        System.out.println("Subject 2 Marks                 : " + subject2Marks);
        System.out.println("Subject 3 Marks                 : " + subject3Marks);

        System.out.println("----------------------------------------------------");

        System.out.println("Total Marks                     : " + totalMarks);

        System.out.println("Average Marks                   : " + averageMarks);

        System.out.println("----------------------------------------------------");

        System.out.println("Grade                           : " + grade);

        System.out.println("Result                          : " + result);

        System.out.println("====================================================");
    }

    // Method to display percentage
    void displayPercentage() {

        double percentage;

        percentage = (totalMarks / 300.0) * 100;

        System.out.println("Percentage                      : " + percentage + "%");

        System.out.println("====================================================");
    }

    // Method to display subject wise status
    void displaySubjectStatus() {

        System.out.println("\n");
        System.out.println("====================================================");
        System.out.println("             SUBJECT WISE STATUS");
        System.out.println("====================================================");

        if (subject1Marks >= 35) {

            System.out.println("Subject 1                       : PASS");
        }
        else {

            System.out.println("Subject 1                       : FAIL");
        }

        if (subject2Marks >= 35) {

            System.out.println("Subject 2                       : PASS");
        }
        else {

            System.out.println("Subject 2                       : FAIL");
        }

        if (subject3Marks >= 35) {

            System.out.println("Subject 3                       : PASS");
        }
        else {

            System.out.println("Subject 3                       : FAIL");
        }

        System.out.println("====================================================");
    }

    // Method to display remarks
    void displayRemarks() {

        System.out.println("\n");
        System.out.println("====================================================");
        System.out.println("                    REMARKS");
        System.out.println("====================================================");

        if (averageMarks >= 90) {

            System.out.println("Remark : Excellent Student");
        }
        else if (averageMarks >= 75) {

            System.out.println("Remark : Very Good Student");
        }
        else if (averageMarks >= 60) {

            System.out.println("Remark : Good Student");
        }
        else if (averageMarks >= 40) {

            System.out.println("Remark : Average Student");
        }
        else {

            System.out.println("Remark : Needs Improvement");
        }

        System.out.println("====================================================");
    }
}

// Main Class
public class StudentGradeManagement {

    public static void main(String[] args) {

        // Creating Student Object
        Student student1 = new Student();

        // Calling methods one by one
        student1.inputStudentDetails();

        student1.calculateTotalMarks();

        student1.calculateAverageMarks();

        student1.calculateGrade();

        student1.calculateResult();

        student1.displayReportCard();

        student1.displayPercentage();

        student1.displaySubjectStatus();

        student1.displayRemarks();

        student1.displayPerformanceMessage();

        System.out.println("\nProgram Executed Successfully!");
    }
}