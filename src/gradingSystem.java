import javax.xml.namespace.QName;
import java.util.Scanner;

public class gradingSystem {


    String name ;
    int marks ;
    int attandance;


    gradingSystem (String name, int marks, int attandance ) {
        this.name = name;
        this.marks = marks;
        this.attandance = attandance;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter marks: ");
        int studentMarks = sc.nextInt();

        System.out.print("Enter attendance: ");
        int studentAttendance = sc.nextInt();



        gradingSystem s1 = new gradingSystem(studentName, studentMarks, studentAttendance);
        //System.out.println("Student Name" + s1.name);

        double newmarks = (studentMarks / 100.0) * 80;
        double attendancePercent = (studentAttendance / 30.0) * 20;

        double total = newmarks + attendancePercent;

        if (studentAttendance < 21 ){
            System.out.println("You're low on attandance");
        }

        System.out.println("Student marks: " + total);

    }

    }
