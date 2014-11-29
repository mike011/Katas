import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PrimeFactorsTest {

    @Test
    public void one() {
        assertEquals(list(), PrimeFactors.generate(1));
    }

    private List<Integer> list(int... ints) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i : ints) {
            list.add(i);
        }
        return list;
    }

    @Test
    public void two() throws Exception {
        assertEquals(list(2), PrimeFactors.generate(2));
    }

    @Test
    public void three() throws Exception {
        assertEquals(list(3), PrimeFactors.generate(3));
    }

    @Test
    public void four() throws Exception {
        assertEquals(list(2,2), PrimeFactors.generate(4));
    }

    @Test
    public void six() throws Exception {
        assertEquals(list(2,3), PrimeFactors.generate(6));
    }

    @Test
    public void eight() throws Exception {
        assertEquals(list(2,2,2), PrimeFactors.generate(8));
    }

    @Test
    public void nine() throws Exception {
        assertEquals(list(3,3), PrimeFactors.generate(9));
    }
}