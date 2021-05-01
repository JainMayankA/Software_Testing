package Homework3;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.FileParameters;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)


public class Problem2ClassTest {
	Problem2Class P2;
	@SuppressWarnings("unused")
	@Before
	public void setUp () throws Exception{
		P2 = new Problem2Class();
	}
	
	@FileParameters("src/Homework3/Problem2TestCaseTable.csv")
	@Test
	public void testcontrolGravitos(int testCaseNo, double AGL, Problem2Class.RRPvals expRRPvals,Problem2Class.RollProgram expRollProgram,Problem2Class.Pods expPods, String bPath) {
		P2.controlGravitos(AGL);
		assertEquals(expRRPvals, P2.getRrp());
		assertEquals(expRollProgram, P2.getRr());
		assertEquals(expPods, P2.getPods());
		
	}

}
