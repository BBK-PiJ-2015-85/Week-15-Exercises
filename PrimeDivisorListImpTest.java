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
		assertEquals("[ 5^2 = 15 ]", test.toString());
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
	
	@Test(expected = IllegalArgumentException.class)
	public void testsAddingNonPrimeNumber() {
		test.add((10));
	}
}