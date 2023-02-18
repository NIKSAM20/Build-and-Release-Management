package brm.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

import mypkg2.ReverseNumber;

public class ReverseNumberTest {

	@Test
	public void test() {
		
		ReverseNumber object= new ReverseNumber();
		
		assertEquals(321, object.reverse(123));
		
	}

}
