import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyTuple {
    int first;
    int second;

    MyTuple(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

public class TupleSorter {
    public static void main(String[] args) {

        List<MyTuple> tuples = new ArrayList<>();
        tuples.add(new MyTuple(1, 3));
        tuples.add(new MyTuple(2, 2));
        tuples.add(new MyTuple(3, 3));
        tuples.add(new MyTuple(4, 1));


        tuples.sort(new Comparator<MyTuple>() {

            public int compare(MyTuple t1, MyTuple t2) {

                if (t2.second != t1.second) {
                    return t2.second - t1.second;
                } else {

                    return t1.first - t2.first;
                }
            }
        });


        for (MyTuple t : tuples) {
            System.out.println(t);
        }
    }
}
