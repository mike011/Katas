import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int i) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int c = 2; i > 1; c++) 
            for (; i % c == 0; i /= c) 
                list.add(c);
        return list;
    }
}
