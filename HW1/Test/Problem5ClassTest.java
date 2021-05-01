package Homework3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {

	Problem5Class P5;
	
	@Before
	public void setUp() throws Exception {
		P5 = new Problem5Class();
	}
	
	@FileParameters("src/Homework3/Problem5TestCaseTable.csv")
	@Test
	public void test(int testCaseNo,double x,double y, String bPath) {
		assertEquals(y,P5.calcY(x),0.001);
		
	}

}

