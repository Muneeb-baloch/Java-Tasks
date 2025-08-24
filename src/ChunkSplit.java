import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChunkSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Check Size");
        int chunk_size = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>() {
        };
        System.out.println("Enter numbers (type -1 to stop):");
        while (true){
            int nums = sc.nextInt();
            if (nums == -1){
                break;
            }
            numbers.add(nums);
        }




        for (int i =0; i < numbers.size();  i += chunk_size) {
            int end = Math.min(i + chunk_size, numbers.size());
            List<Integer> sub = new ArrayList<>(numbers.subList(i, end));
            while (sub.size() < chunk_size) {
                sub.add(0);

            }

            System.out.println(sub);


            }

        }







    }



