package dev.juho.leetcode.problem1578;

public class Problem {

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
