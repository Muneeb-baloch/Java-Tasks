import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Guess the Number between 20");
        int randomNumber = r.nextInt(20);

        int i ;
        int maxscore = 10;

        for (i = 1; i<= 10; i++){
            System.out.println("Enter your number");
            int userguess = sc.nextInt();
            if (randomNumber == userguess){
                int userscore = maxscore-i;
                int x = userscore*10;
                System.out.println("Your Guess is Right");
                System.out.println("Your Score is : " + x);


            }


        }

        System.out.println("You're out of tries");


    }


}
