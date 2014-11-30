import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralsTest {
    
    @Test
    public void zero() throws Exception {
        assertEquals("", RomanNumerals.roman(0));
    }

    @Test
    public void one() {
        assertEquals("I", RomanNumerals.roman(1));
    }

    @Test
    public void two() throws Exception {
        assertEquals("II", RomanNumerals.roman(2));
    }
    
    @Test
    public void three() throws Exception {
        assertEquals("III", RomanNumerals.roman(3));
    }

    @Test
    public void four() throws Exception {
        assertEquals("IV", RomanNumerals.roman(4));
    }

    @Test
    public void five() throws Exception {
        assertEquals("V", RomanNumerals.roman(5));
    }

    @Test
    public void six() throws Exception {
        assertEquals("VI", RomanNumerals.roman(6));
    }

    @Test
    public void seven() throws Exception {
        assertEquals("VII", RomanNumerals.roman(7));
    }

	@Test
	public void eight() throws Exception {
		assertEquals("VIII", RomanNumerals.roman(8));
	}
	
	@Test
	public void nine() throws Exception {
		assertEquals("IX", RomanNumerals.roman(9));
	}

	@Test
	public void ten() throws Exception {
		assertEquals("X", RomanNumerals.roman(10));
	}

	@Test
	public void eleven() throws Exception {
		assertEquals("XI", RomanNumerals.roman(11));
	}
	
	@Test
	public void fifteen() throws Exception {
		assertEquals("XV", RomanNumerals.roman(15));
	}
}
