package calc;

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
	public void testOne() {
		System.out.println("Using calculator instance " + TestClass.c);
	}

	@Ignore
	@Test
	public void testTwo() {
		System.out.println("Test Two");
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
