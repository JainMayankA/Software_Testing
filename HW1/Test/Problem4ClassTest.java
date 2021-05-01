package Homework3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import Homework3.Problem4Class.Status;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {

	Problem4Class P4;
	
	@Before
	public void setUp() throws Exception {
		P4 = new Problem4Class();
	}
	
	@FileParameters("src/Homework3/Problem4TestCaseTable.csv")
	@Test
	public void test(int testCaseNo,Status status, double cart, int creditRating, int points,boolean op, String bPath,String cm ) {
		assertEquals(op,P4.checkOut(status, cart, creditRating, points));
	}

}

