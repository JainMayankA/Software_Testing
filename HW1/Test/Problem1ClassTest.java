package Homework3;
import static junitparams.JUnitParamsRunner.$;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)

public class Problem1ClassTest {
	Problem1Class P1;
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem1ClassTest () {
		return $(
//				Parameters are: (1,2)
//				1 = mthUsage 2 = charges
//				Test case 1
				$(0.00,   270.63),
//				Test case 2
				$(1000.00,	273.33),
//				Test case 3				
				$(1000.01,	546.66),
//				Test case 4				
				$(2499.99,	554.78),
//				Test case 5				
				$(2500.00,	838.94),
//				Test case 6				
				$(5000.00,	866.00),
//				Test case 7				
				$(5000.01,	1109.56),
//				Test case 8	
				$(6499.99,	1133.92),
//				Test case 9	
				$(6500.00,	1331.48),
//				Test case 10	
				$(8000.00,	1363.95),
//				Test case 11	
				$(8000.01,	1547.98),
//				Test case 12	
				$(9999.99,	1596.69),
//				Test case 13	
				$(10000.00,	1437.02),
//				Test case 14	
				$(15000.00, 1546.62),
//				Test case 15	
				$(15000.01,	1725.23),
//				Test case 16	
				$(20000.00, 1840.25)
				
				);
	}
	
	@Before
	public void setUp () {
		P1 = new Problem1Class();
	}
	@Test 
	@Parameters(method="parametersForProblem1ClassTest")
	public void test(double mthUsage, double charges) {
		assertEquals(charges,P1.calcBill(mthUsage),0.006);
	}
	
//	}

}
