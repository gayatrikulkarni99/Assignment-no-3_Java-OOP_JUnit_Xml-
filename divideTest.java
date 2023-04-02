package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(30,5);
		assertEquals(6,output);
	}
	
	@Test
	public void test2() {
		JunitTesting test2 = new JunitTesting();
		double output2 = test2.divide(60,5);
		assertEquals(6,output2);
	}
	

}
