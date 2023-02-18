package brm.lab6;

import static org.junit.Assert.*;

import org.junit.Test;

import Mypkg6.Average;

public class MyTest {

	@Test
	public void test() {
		Average ob = new Average();
		assertEquals(3,ob.avg(2, 3, 4));
	}

}
