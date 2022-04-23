package jUnitTestingPackage;
//ARYANSHARMA
//E20CSE087
import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction jUnit = new jUnitFunction();
		int result = jUnit.AddNumbers(200, 300);
		assertEquals(500, result);
		
	}

}
