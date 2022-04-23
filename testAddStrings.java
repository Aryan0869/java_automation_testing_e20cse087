package jUnitTestingPackage;
//ARYANSHARMA
//E20CSE087
import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction jUnit = new jUnitFunction();
		String result = jUnit.AddStrings("Jatin", "Rastogi");
		assertEquals("JatinRastogi", result);
	}

}
