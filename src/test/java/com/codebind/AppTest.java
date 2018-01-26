package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		App tester = new App();
		assertEquals(tester.Sample(), "Hello World");
	}

}
