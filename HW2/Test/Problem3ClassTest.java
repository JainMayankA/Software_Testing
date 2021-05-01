package Homework5;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {
	Problem3Class P3;

	@Before
	public void setUp() throws Exception {
		P3 = new Problem3Class();
	}

	@FileParameters("src/Homework5/ProblemTestCase3Table.csv")
	@Test
	public void test(String testCaseNo, double roomTotal, boolean coupon, int memberPoints, int days, boolean member, double taxRate, double result, String bPath, String comments) {
		assertEquals(result, P3.hotelDiscount(roomTotal, coupon, memberPoints, days, member, taxRate), 0.01);
	}

}
