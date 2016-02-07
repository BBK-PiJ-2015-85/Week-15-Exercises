package src;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class PrimeDivisorListImpTest {
	PrimeDivisorList test;
	
	@Before
	public void setUp() {
		test = new PrimeDivisorListImp();
	}
	
	@Test
	public void addsOneNumber() {
		test.add((5));
		assertEquals("[ 5 = 5 ]", test.toString());
	}
	
	@Test
	public void addsTwoNumbers() {
		test.add((5));
		test.add((3));
		assertEquals("[ 5 * 3 = 15 ]", test.toString());
	}
	
	@Test
	public void addsTwoNumbersTheSame() {
		test.add((5));
		test.add((5));
		assertEquals("[ 5^2 = 25 ]", test.toString());
	}
	
	@Test
	public void testsAddsMultipleNumbersSomeTheSame() {
		test.add((5));
		test.add((5));
		test.add((5));
		test.add((2));
		test.add((7));
		test.add((7));
		assertEquals("[ 5^3 * 2 * 7^2 = 12250 ]", test.toString());
	}

	@Test
	public void testsAddsMoreMultipleNumbersSomeTheSame() {
		test.add((5));
		test.add((3));
		test.add((5));
		test.add((2));
		test.add((7));
		test.add((7));
		test.add((7));
		test.add((11));
		test.add((11));
		test.add((23));
		assertEquals("[ 5 * 3 * 5 * 2 * 7^3 * 11^2 * 23 = 143185350 ]", test.toString());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testsAddingNonPrimeNumber() {
		test.add((10));
	}

	@Test(expected = NullPointerException.class)
	public void testsAddingNullToList() {
		test.add(null);
	}
}