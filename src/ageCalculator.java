import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class ageCalculator {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your DOB in Numbers only (yyyy,mm,dd)  ");
        String dob = sc.nextLine();
        System.out.println(dob);
        LocalDate birthday = LocalDate.parse(dob, DateTimeFormatter.ofPattern("yyyy,MM,dd"));

        LocalDate today = LocalDate.now();

        System.out.println(today);

        Period age = Period.between(birthday, today);




        System.out.println("You are " + age.getYears() + " years, "
                + age.getMonths() + " months, and "
                + age.getDays() + " days old.");




    }


}

