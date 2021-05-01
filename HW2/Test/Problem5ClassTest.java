package Homework5;

import static org.junit.Assert.assertEquals;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {
	Problem5Class P5;
	Problem5ServerData mockObj;

	@Before
	public void setUp() throws Exception {
		P5 = new Problem5Class();
		mockObj = EasyMock.strictMock(Problem5ServerData.class);
	}
	@FileParameters("src/Homework5/ProblemTestCase5Table.csv")
	@Test
	public void test(String testCaseNo, double usageSrvr, double totalPrice, String bPath) {
		EasyMock.expect(mockObj.getUsage()).andReturn(usageSrvr);
		EasyMock.replay(mockObj);
		assertEquals(totalPrice, P5.calcBill(mockObj), 0.01);
	}

}
