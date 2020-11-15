package dev.juho.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem1578 {

	public void solve() {
		System.out.println("cost " + minCost("abaac", new int[]{1, 2, 3, 4, 5}));
		System.out.println("cost " + minCost("abc", new int[]{1, 2, 3}));
		System.out.println("cost " + minCost("aabaa", new int[]{1, 2, 3, 4, 1}));
		System.out.println("cost " + minCost("cddcdcae", new int[]{4, 8, 8, 4, 4, 5, 4, 2}));
	}

	public int minCost(String s, int[] cost) {
		int[] store = new int[cost.length];
		int storeIndex = 0;
		int highestCost = 0;

		int totalRemovalCost = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int removalCost = cost[i];

			if (i == 0) {
				store[storeIndex++] = removalCost;
				if (removalCost > highestCost) {
					highestCost = removalCost;
				}
				continue;
			}

			if (c == s.charAt(i - 1)) {
				store[storeIndex++] = removalCost;
				if (removalCost > highestCost) {
					highestCost = removalCost;
				}
				continue;
			}

			totalRemovalCost += storeCost(store, highestCost, storeIndex);
			storeIndex = 0;
			highestCost = 0;

			store[storeIndex++] = removalCost;
			if (removalCost > highestCost) {
				highestCost = removalCost;
			}
		}

		totalRemovalCost += storeCost(store, highestCost, storeIndex);
		return totalRemovalCost;
	}

	private int storeCost(int[] store, int highest, int storeIndex) {
		int cost = 0;
		int removedCount = 0;
		for (int i = 0; i < storeIndex; i++) {
			int c = store[i];

			if (c != highest) {
				cost += c;
				removedCount++;
			}
		}

		int itemsLeft = storeIndex - removedCount;
		cost += (itemsLeft - 1) * highest;

		return cost;
	}

	public static class Data {
		public int index, cost;

		public Data(int index, int cost) {
			this.index = index;
			this.cost = cost;
		}
	}

}
