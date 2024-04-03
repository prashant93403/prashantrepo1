package dev.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calcitest {

	@Test
	void test() {
	}

}
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatortest {

	@Test
	public void calTest() {
		assertEquals(31, Calci.add(11, 20));
	}

	@Test
	public void calTestSub() {
		assertEquals(30, Calci.sub(50, 20));
	}

	@Test
	public void calcTestMul() {
		assertEquals(30, Calci.mul(6, 5));
	}

	@Test
	public void calcTestDiv() {
		assertEquals(6, Calci.div(30, 5));
	}

}