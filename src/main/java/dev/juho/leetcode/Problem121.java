package dev.juho.leetcode;

import java.util.Arrays;

public class Problem121 {

	public void solve() {
		int[] first = new int[]{7, 1, 5, 3, 6, 4};
		System.out.println(Arrays.toString(first) + ": " + maxProfit(first));

		int[] second = new int[]{7, 6, 4, 3, 1};
		System.out.println(Arrays.toString(second) + ": " + maxProfit(second));

		int[] third = new int[]{3, 100, 1, 4};
		System.out.println(Arrays.toString(third) + ": " + maxProfit(third));
	}

	public int maxProfit(int[] prices) {
		int highestProfit = 0;
		int lowest = Integer.MAX_VALUE;
		int highest = 0;

		for (int currentPrice : prices) {
			if (lowest > currentPrice) {
				int newProfit = highest - lowest;
				if (newProfit > highestProfit) {
					highestProfit = newProfit;
				}

				lowest = currentPrice;
				highest = 0;
			}

			if (highest < currentPrice) {
				highest = currentPrice;
			}
		}

		int newProfit = highest - lowest;
		if (newProfit > highestProfit) {
			highestProfit = newProfit;
		}

		return highestProfit;
	}

}
