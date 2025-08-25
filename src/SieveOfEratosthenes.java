import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SieveOfEratosthenes {

    public static void main(String[] args) {

List<Integer> List1 = new ArrayList<>();
    for (int i = 2; i<=30; i++){
        if (PrimeUtils.isPrime (i)){
            int j = i;
            int x= i*i;
            List1.removeAll(Collections.singleton(Integer.valueOf(x)));
            List1.add(j);
        }

    }
        System.out.println(List1);
    }



}
