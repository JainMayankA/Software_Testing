package Homework5;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import Homework5.Problem2CORRECTEDClass.gDoorStates;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem2CORRECTEDClassTest {

	Problem2CORRECTEDClass P2;
	
	@Before
	public void setUp() throws Exception {
		P2 = new Problem2CORRECTEDClass();
	}
	@FileParameters("src/Homework5/ProblemTestCase2Table.csv")
	@Test
	public void test(String testCaseNo, gDoorStates state, boolean T, boolean B, boolean O, boolean R, boolean DR, boolean LO, boolean DS, gDoorStates nextState) {
		P2.setState(state);
		P2.setT(T);
		P2.setB(B);
		P2.setO(O);
		P2.setR(O);
		P2.garageDoorOpener();
		assertEquals(LO, P2.isLO());
		assertEquals(DS, P2.isDS());
		assertEquals(DR, P2.isDR());
		
		
	}

}
