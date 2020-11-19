package dev.juho.leetcode.problem1337;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

	@Test
	void testKWeakestRowsExampleOne() {
		int[][] mat = new int[][]{
				{1, 1, 0, 0, 0},
				{1, 1, 1, 1, 0},
				{1, 0, 0, 0, 0},
				{1, 1, 0, 0, 0},
				{1, 1, 1, 1, 1}
		};
		int k = 3;

		assertArrayEquals(new int[]{2, 0, 3}, new Problem().kWeakestRows(mat, k));
	}

	@Test
	void testKWeakestRowsExampleTwo() {
		int[][] mat = new int[][]{
				{1, 0, 0, 0},
				{1, 1, 1, 1},
				{1, 0, 0, 0},
				{1, 0, 0, 0}
		};
		int k = 2;

		assertArrayEquals(new int[]{0, 2}, new Problem().kWeakestRows(mat, k));
	}

	@Test
	void testKWeakestRowsFullOfSoldiers() {
		int[][] mat = new int[][]{
				{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1}
		};
		int k = 1;

		assertArrayEquals(new int[]{0}, new Problem().kWeakestRows(mat, k));
	}

	@Test
	void testKWeakestRowsLastRowFill() {
		int[][] mat = new int[][]{
				{1, 1, 1, 1, 1},
				{1, 0, 0, 0, 0},
				{1, 1, 0, 0, 0},
				{1, 1, 1, 1, 0},
				{1, 1, 1, 1, 1}
		};
		int k = 3;

		assertArrayEquals(new int[]{1, 2, 3}, new Problem().kWeakestRows(mat, k));
	}
}