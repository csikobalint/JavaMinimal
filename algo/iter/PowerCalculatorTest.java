package algo.iter;
import org.junit.Test;
import static org.junit.Assert.*;

public class PowerCalculatorTest {

	@Test
	public void raisedToZero(){
		PowerCalculator calculator = PowerCalculator.INSTANCE;
		System.out.println("raised to zero");
		assertEquals(1, calculator.calculate(0,0));
		assertEquals(1, calculator.calculate(1,0));
		assertEquals(1, calculator.calculate(13,0));
		assertEquals(1, calculator.calculate(27,0));

	}

	@Test
	public void raisedToOne(){
		PowerCalculator calculator = PowerCalculator.INSTANCE;
		System.out.println("raised to one");
		assertEquals(0, calculator.calculate(0,1));
		assertEquals(1, calculator.calculate(1,1));
		assertEquals(13, calculator.calculate(13,1));
		assertEquals(27, calculator.calculate(27,1));
	}

	@Test(expected=IllegalArgumentException.class)
	public void negativeBase(){
		PowerCalculator calculator = PowerCalculator.INSTANCE;
		System.out.println("illegal base");
		assertEquals(1, calculator.calculate(-1,0));
	}
}