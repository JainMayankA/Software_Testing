package Homework5;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {
	Problem4Class P4;

	@Before
	public void setUp() throws Exception {
		P4 = new Problem4Class();
	}

	@FileParameters("src/Homework5/ProblemTestCase4Table.csv")
	@Test
	public void test(String testCaseNo, double roomTotal, boolean coupon, int memberPoints, int days, boolean member, double taxRate, double result, String bPath, String comments) {
		assertEquals(result, P4.hotelDiscount(roomTotal, coupon, memberPoints, days, member, taxRate), 0.01);
	}

}
