package dev.juho.leetcode;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Problem1337 {

	/*
		1337. The K Weakest Rows in a Matrix

		Given a m * n matrix mat of ones (representing soldiers) and zeros (representing civilians),
		return the indexes of the k weakest rows in the matrix ordered from the weakest to the strongest.

		A row i is weaker than row j, if the number of soldiers in row i is less than the number of soldiers in row j,
		or they have the same number of soldiers but i is less than j. Soldiers are always stand in the frontier of a row,
	    that is, always ones may appear first and then zeros.

	    Input: mat =
		[[1,1,0,0,0],
		 [1,1,1,1,0],
		 [1,0,0,0,0],
		 [1,1,0,0,0],
		 [1,1,1,1,1]],
		k = 3
		Output: [2,0,3]
		Explanation:
		The number of soldiers for each row is:
		row 0 -> 2
		row 1 -> 4
		row 2 -> 1
		row 3 -> 2
		row 4 -> 5
		Rows ordered from the weakest to the strongest are [2,0,3,1,4]

		Input: mat =
		[[1,0,0,0],
		 [1,1,1,1],
		 [1,0,0,0],
		 [1,0,0,0]],
		k = 2
		Output: [0,2]
		Explanation:
		The number of soldiers for each row is:
		row 0 -> 1
		row 1 -> 4
		row 2 -> 1
		row 3 -> 1
		Rows ordered from the weakest to the strongest are [0,2,3,1]
	 */

	public void solve() {
		int[][] first = new int[][]{
				{1, 1, 0, 0, 0},
				{1, 1, 1, 1, 0},
				{1, 0, 0, 0, 0},
				{1, 1, 0, 0, 0},
				{1, 1, 1, 1, 1}
		};
		System.out.println("k=3 [2, 0, 3] > " + Arrays.toString(kWeakestRows(first, 3)));

		int[][] second = new int[][]{
				{1, 0, 0, 0},
				{1, 1, 1, 1},
				{1, 0, 0, 0},
				{1, 0, 0, 0}
		};
		System.out.println("k=2 [0, 2] > " + Arrays.toString(kWeakestRows(second, 2)));

		int[][] third = new int[][]{
				{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1}
		};
		System.out.println("k=1 [0] > " + Arrays.toString(kWeakestRows(third, 1)));

		int[][] fourth = new int[][]{
				{1, 1, 1, 1, 1},
				{1, 0, 0, 0, 0},
				{1, 1, 0, 0, 0},
				{1, 1, 1, 1, 0},
				{1, 1, 1, 1, 1}
		};
		System.out.println("k=3 [1, 2, 3] > " + Arrays.toString(kWeakestRows(fourth, 3)));
	}

	public int[] kWeakestRows(int[][] mat, int k) {
		int rowCount = 0;
		int[] weakest = new int[k];
		Arrays.fill(weakest, -1);

		for (int i = 0; i < mat[0].length; i++) {
			for (int j = 0; j < mat.length; j++) {
				boolean alreadySaved = false;
				for (int w : weakest) {
					if (w == j) {
						alreadySaved = true;
						break;
					}
				}

				if (alreadySaved) {
					continue;
				}

				int[] row = mat[j];
				if (row[i] == 0) {
					weakest[rowCount++] = j;

					if (rowCount == k) {
						return weakest;
					}

					continue;
				}
			}
		}

		if (rowCount < k) {
			for (int i = 0; i < mat.length; i++) {
				boolean alreadySaved = false;
				for (int w : weakest) {
					if (w == i) {
						alreadySaved = true;
						break;
					}
				}

				if (alreadySaved) {
					continue;
				}

				weakest[rowCount++] = i;
				if (rowCount == k) {
					return weakest;
				}
			}
		}

		return weakest;
	}

}
