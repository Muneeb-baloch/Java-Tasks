import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        Set<Integer> set1 = new HashSet<>();
        set1.add(7);
        set1.add(2);
        set1.add(6);
        set1.add(7);
        set1.add(8);

        set1.removeAll(set);
        set.removeAll(set1);

        System.out.println(set);
        System.out.println(set1);







    }


}
