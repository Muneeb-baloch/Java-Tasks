import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class numbercube {

    public static void main(String[] args) {
        Map<Integer, Integer > numbercube = new HashMap<>();

        List <List<Integer>> List1 = new ArrayList<>();
        for (int i =1; i<= 20; i++){
            List <Integer> tuple = new ArrayList<>();
            tuple.add(i);
            int x = i*i*i;
            tuple.add(x);
            List1.add(tuple);

//            numbercube.put(i,x );
        }
        System.out.println(List1);
    }


}
