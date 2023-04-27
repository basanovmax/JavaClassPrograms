package com.java.Practice;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnitPracticeTest {
	@Test
	void twoPlusTwoEqualTwo() {
		var calculator = new JUnitPractice();
		assertEquals(4, calculator.add(2, 2));
	}
}