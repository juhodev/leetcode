package dev.juho.leetcode.problem121;

public class Problem {

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
