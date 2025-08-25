import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SmallestMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (type any non-integer to stop):");
        Set<Integer> numberSet = new HashSet<>();
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            numberSet.add(num);
        }

        int smallestMissing = 1;
        while (numberSet.contains(smallestMissing)) {
            smallestMissing++;
        }
        System.out.println("Smallest missing positive integer: " + smallestMissing);
    }
}
