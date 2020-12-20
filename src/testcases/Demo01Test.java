package testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * JUNIT -
 * It is an open-source testing framework for java programmers.
 * The java programmer can create test cases and test his/her own code.
 * 
 * @Test annotation specifies that method is the test method.
 * @Test(timeout=1000) annotation specifies that method will be failed if it takes longer than 1000 milliseconds (1 second).
 * @BeforeClass annotation specifies that method will be invoked only once, before starting all the tests.
 * @Before annotation specifies that method will be invoked before each test.
 * @After annotation specifies that method will be invoked after each test.
 * @AfterClass annotation specifies that method will be invoked only once, after finishing all the tests
 * 
 */

public class Demo01Test {

	@Test
	public void findMaxNumberTest() {
		System.out.println("Earlier test case for max number...");
		int[] arr = { 19, 12, 23, 45, 3, 21 };
		int[] arr1 = { -19, -12, -23, -45, -3, -21 };
		int expected = 45;
		int expected1 = -3;

		int result = Demo01.findMax(arr);
		assertEquals(expected, result);

		int result1 = Demo01.findMax(arr1);
		assertEquals(expected1, result1);
	}

	@BeforeClass
	public static void setupBeforeClass() {
		System.out.println("Before Class....");
	}

	@Before
	public void setup_function_gets_called_before_every_test_case() {
		System.out.println("Before...");
	}

	@Test
	public void test_to_find_max_number_from_input_array_of_integers() {
		System.out.println("test case of find max number...");
		int[] arr = { 19, 12, 23, 45, 3, 21 };
		int[] arr1 = { -19, -12, -23, -45, -3, -21 };
		int expected = 45;
		int expected1 = -3;

		int result = Demo01.findMax(arr);
		boolean eq = expected == result;
		assertEquals(expected, result);
		assertTrue(eq);

		int result1 = Demo01.findMax(arr1);
		boolean eq1 = expected1 == result1;
		assertEquals(expected1, result1);
		assertTrue(eq1);
	}

	@Test
	public void it_should_test_function_to_return_cube_of_input_number() {
		System.out.println("test case to get cube of number...");
		int expected = 27;
		int result = Demo01.cube(3);

		assertEquals(expected, result);
	}

	@Test
	public void it_should_return_reverse_of_input_string() {
		System.out.println("test case to find reverse of input String...");
		String expected = "my name is ankit";
		String result = Demo01.reverseWord("ym eman si tikna");

		assertEquals(expected, result);
	}

	@After
	public void tearDown_function_gets_called_after_every_test_case() {
		System.out.println("After...");
	}

	@AfterClass
	public static void tearDownAfterClass_gets_called_after_all_test_gets_executed() {
		System.out.println("After Class...");
	}
}
