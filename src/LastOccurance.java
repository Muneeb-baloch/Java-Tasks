import java.util.*;

public class LastOccurance {

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
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

        for (int i = 0; i<numbers.size(); i++ ){
            for (int j = i+1; j<numbers.size(); j++ ){
                if (numbers.get(i)  == numbers.get(j)){
                    numbers.remove(i);

                }

            }
        }


        System.out.println(numbers);



    }






}
