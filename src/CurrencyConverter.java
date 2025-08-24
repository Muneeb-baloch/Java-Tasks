import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the currency");

        System.out.println("1 Pound to PKR");
        System.out.println("2 Dollar to PKR");
        System.out.println("3 Euro to PKR");
        System.out.println("4 PKR to Pound ");
        System.out.println("5 PKR to Dollor");
        System.out.println("6 PKR to Euro");
        int cValue = sc.nextInt();

        System.out.println("Enter Amount");

        double amount = sc.nextDouble();

int pound = 384;
int USD = 283;
int Euro = 331;


        switch (cValue){
            case 1:
                System.out.println(pound*amount);
                break;

            case 2:
                System.out.println(USD*amount);
                break;
            case 3:
                System.out.println(Euro*amount);
                break;
            case 4:
                System.out.println(amount/pound);
                break;

            case 5:
                System.out.println(amount/USD);
                break;
            case 6:
                System.out.println(amount/Euro);
                break;

            case 7:
            default:
                System.out.println("Invalid currency");


        }

    }

}
