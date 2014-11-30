import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void one() {
		assertEquals("1", FizzBuzz.of(1));
	}

	@Test
	public void three() throws Exception {
		assertEquals("fizz", FizzBuzz.of(3));
	}
	
	@Test
	public void five() throws Exception {
		assertEquals("buzz", FizzBuzz.of(5));
	}
	
	@Test
	public void fifteen() throws Exception {
		assertEquals("fizzbuzz", FizzBuzz.of(15));
	}
	
	@Test
	public void six() throws Exception {
		assertEquals("fizz", FizzBuzz.of(6));
	}

}
