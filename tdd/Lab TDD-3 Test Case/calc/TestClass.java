package calc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestClass {
	public static Calculator c;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		TestClass.c = new CalcImp();
	}

	@Test
	public void testSub1() { 
		int result = TestClass.c.sub(2, 2);
		assertEquals("Error message",0, result);
	}
	@Test
	public void testSub2() { 
		int result = TestClass.c.sub(2, 3);
		assertEquals("Error message",-1, result);
	}


	/*
	 * @AfterClass public static void tearDownAfterClass() throws Exception {
	 * System.out.println("---- After Class method"); }
	 * 
	 * @Before public void setUp() throws Exception {
	 * System.out.println("-- Before method"); }
	 * 
	 * @After public void tearDown() throws Exception {
	 * System.out.println("-- After method"); }
	 * 
	 */

}
