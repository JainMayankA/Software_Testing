package Homework3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import Homework3.Problem3Class.landingState;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {

	Problem3Class P3;
	
	@Before
	public void setUp() throws Exception {
		P3 = new Problem3Class();
	}
	
	@FileParameters("src/Homework3/Problem3TestCaseTable.csv")
	@Test
	public void test(int testCaseNo, boolean landEngaged, double altitude, double speed, landingState ls, String bPath, String cm) {
		assertEquals(ls, P3.landCraft(landEngaged, altitude, speed));
	}

}

