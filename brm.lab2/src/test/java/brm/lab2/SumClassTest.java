package brm.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

import mypkg2.SumClass;

public class SumClassTest {

	@Test
	public void test() {
		
		SumClass obj = new SumClass();
		
		assertEquals(40, obj.sum(30, 10));
	}

}
