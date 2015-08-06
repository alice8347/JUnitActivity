import org.junit.*;
import static org.junit.Assert.*;
import static java.lang.System.out;

public class CalculatorTest {
	@Test
	public void test_multiplication() {
		out.println("Test if the multiplication function is correct.");
		assertTrue(Calculator.calculate(33, 3, 3) == 99);
	}
	
	@Test
	public void test_division() {
		out.println("Test if the division fuction is correct.");
		assertEquals(12, Calculator.calculate(120, 10, 4), 0);	//assertEquals(expectedValue, actualValue, epsilon->how precise)
	}
	
	@Test
	public void test_modulus() {
		out.println("Test if the modulus function is correct.");
		assertTrue(Calculator.calculate(100, 3, 5) == 1);
	}
}
