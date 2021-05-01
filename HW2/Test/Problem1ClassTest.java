package Homework5;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import Homework5.Problem1Class.motorStates;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {
	Problem1Class P1;

	@Before
	public void setUp() throws Exception {
		P1 = new Problem1Class();
	}
	@FileParameters("src/Homework5/ProblemTestCase1Table.csv")
	@Test
	public void test(String testcaseNo, double AGL, double velocity, boolean autoLandEng, double retroForce, motorStates ms, boolean applyRockets, String bPath, String comments) {
		P1.retroRocket(AGL, velocity, autoLandEng);
		assertEquals(retroForce, P1.getRetroForce(), 0.001);
		assertEquals(ms, P1.getMs());
		assertEquals(applyRockets, P1.isApplyRockets());
	}

}
