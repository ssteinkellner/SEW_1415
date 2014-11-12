package ssteinkellner.tests;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ssteinkellner.behavior.*;
import ssteinkellner.calculators.*;


public class CalculatorTest {
	Calculator c, c1;
	List<Double> l;
	
	@Before
	public void setUp(){
		c = new Calculator();
		c.addValue(1.3);
		c.addValue(4.2);
	}

	@Test
	public void addAndRemove(){
		String text = c.toString();
		c.addValue(0.5);
		Assert.assertEquals(text+", 0.5", c.toString());
		c.removeValue(0.5);
		Assert.assertEquals(text, c.toString());
	}
	
	@Test
	public void SimpleCalculation() {
		c1 = new AddingCalculator();
		c1.addValue(4.7);
		l = c1.prozessCalculations();
		Assert.assertEquals((Double)5.7, (Double)l.get(0));
	}

	
	@Test
	public void testAdding(){
		c1 = new AddingCalculator();
		c1.addValue(1.3);
		c1.addValue(4.2);
		c1.prozessCalculations();
		Assert.assertEquals("2.3, 5.2", c1.toString());
		
		c.setCalculationBehavior(new AddingBehavior());
		c.prozessCalculations();
		Assert.assertEquals(c1.toString(), c.toString());
	}
	
	@Test
	public void testSubtracting(){
		c1 = new SubtractingCalculator();
		c1.addValue(1.3);
		c1.addValue(4.2);
		c1.prozessCalculations();
		Assert.assertEquals("0.3, 3.2", c1.toString());
		
		c.setCalculationBehavior(new SubtractingBehavior());
		c.prozessCalculations();
		Assert.assertEquals(c1.toString(), c.toString());
	}
	
	@Test
	public void testMultiplying(){
		c1 = new MultiplyingCalculator();
		c1.addValue(1.3);
		c1.addValue(4.2);
		c1.setModifier(2);
		c1.prozessCalculations();
		Assert.assertEquals("2.6, 8.4", c1.toString());
		
		c.setCalculationBehavior(new MultiplyingBehavior());
		c.setModifier(2);
		c.prozessCalculations();
		Assert.assertEquals(c1.toString(), c.toString());
	}
	
	@Test
	public void testDividing(){
		c1 = new DividingCalculator();
		c1.addValue(1.3);
		c1.addValue(4.2);
		c1.setModifier(2);
		c1.prozessCalculations();
		Assert.assertEquals("0.65, 2.1", c1.toString());
		
		c.setCalculationBehavior(new DividingBehavior());
		c.setModifier(2);
		c.prozessCalculations();
		Assert.assertEquals(c1.toString(), c.toString());
	}
}
