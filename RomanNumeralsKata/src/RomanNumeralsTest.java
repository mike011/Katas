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
}
