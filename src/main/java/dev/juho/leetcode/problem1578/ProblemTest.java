package dev.juho.leetcode.problem1578;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

	@Test
	void testMinCostExampleOne() {
		String s = "abaac";
		int[] costArray = new int[]{1, 2, 3, 4, 5};

		assertEquals(3, new Problem().minCost(s, costArray));
	}

	@Test
	void testMinCostExampleTwo() {
		String s = "abc";
		int[] costArray = new int[]{1, 2, 3};

		assertEquals(0, new Problem().minCost(s, costArray));
	}

	@Test
	void testMinCostExampleThree() {
		String s = "aabaa";
		int[] costArray = new int[]{1, 2, 3, 4, 1};

		assertEquals(2, new Problem().minCost(s, costArray));
	}

	@Test
	void testMinCostTestFour() {
		String s = "cddcdcae";
		int[] costArray = new int[]{4, 8, 8, 4, 4, 5, 4, 2};

		assertEquals(8, new Problem().minCost(s, costArray));
	}
}