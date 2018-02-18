package ch.kschmidster.test.circleci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		assertEquals(3, new App().add(1, 2));
	}

}
