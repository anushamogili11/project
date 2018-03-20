package calc;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {
	private static CalculatorMain calc;
	@Rule
	public ExpectedException expectedException=ExpectedException.none();
	public CalculatorTest() {
		this.setup();
	}
	@BeforeClass
	public static void setup(){
		calc = new CalculatorMain();
	}
	
	@Test
	public void testAdd() {
		assertEquals(5, calc.add(3,2));
	}
	@Test
	public void testSub() {
		assertEquals(1, calc.sub(3,2));
	}
	@Test
	public void testMul() {
		assertEquals(6, calc.mul(3,2));
	}
	@Test
	public void testDiv() {
		try {
			assertEquals(1, calc.div(2,2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test/*(expected=ArithmeticException.class)*/
	public void testDivByZero() throws Exception  {
		expectedException.expect(ArithmeticException.class);
		//expectedException.expectMessage(containsSt);
		calc.div(3,0);
	}
	@Test
	public void testSin() {
		assertEquals(0,calc.sin(0),0);
	}
	
	@Test
	public void testSqr() {
		assertEquals(4, calc.sqr(16),0);
	}
	@Test
	public void testMod() {
		assertEquals(0, calc.mod(10,5));
	}
	@Test
	public void testArea() {
		assertEquals(50.4, calc.area(4),0);
	}
	@Test
	public void testsin() {
		assertEquals(0, calc.sin(0),0);
	}
	

	public void testcos() {
		assertEquals(1, calc.cos(0),0);
	}
	@Test
	public void testtan() {
		assertEquals(1, (int)calc.tan(45),0);
	}
	@Test
	public void testsec() {
		assertEquals(1, calc.sec(0),0);
	}
	@Test
	public void testlog() {
		assertEquals(0, calc.log(1),0);
	}
	@Test
	public void testpower() {
		assertEquals(4, calc.power(2,2),0);
	}
	@Test
	public void testsquare() {
		assertEquals(9, calc.square(3));
	}
	@Test
	public void testTanUsingSinAndCos() {
		double calculatedTanVal=0.0;
		 try {
			 calculatedTanVal= (calc.div(calc.sin(45),calc.cos(45)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue("tan()=sin()/cos()",calc.tan(45)==calculatedTanVal);
	}
	@Test
	public void testCotUsingSinAndCos() {
		double calculatedCotVal=0.0;
		double calculatedTanVal=0.0;
		 try {
			 calculatedCotVal= (calc.div(calc.cos(45),calc.sin(45)));
			 calculatedTanVal=(calc.div(1,calc.tan(45)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue("1/tan()=cos()/sin()",calculatedTanVal==calculatedCotVal);
	}
	
	@Test
	public void testSecUsingCos() {
		double calculatedSecVal=0.0;
		 try {
			 calculatedSecVal= (calc.div(1,calc.cos(45)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //System.out.println(calculatedCotVal);
		 
		assertTrue("sec()=1/cos()",calc.sec(45)==calculatedSecVal);
	}
	
	@Test
	public void testPresedence() {
		int calculatedval=0;
		 try {
			 calculatedval=  (int)calc.div(10, 2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(30, calc.add(calc.mul(5, 5),calculatedval));
	}
	@Test
	public void testPresedenceNotEquals() {
		int calculatedval=0;
		 try {
			 calculatedval=  (int)calc.div(10, 2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotEquals(35, calc.add(calc.mul(5, 5), calculatedval));
	}
}

