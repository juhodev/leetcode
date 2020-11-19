package dev.juho.leetcode.problem121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

	@Test
	void testMaxProfitExampleOne() {
		assertEquals(5, new Problem().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
	}

	@Test
	void testMaxProfitExampleTwo() {
		assertEquals(0, new Problem().maxProfit(new int[]{7, 6, 4, 3, 1}));
	}

	@Test
	void testMaxProfitExampleThree() {
		assertEquals(97, new Problem().maxProfit(new int[]{3, 100, 1, 4}));
	}
}