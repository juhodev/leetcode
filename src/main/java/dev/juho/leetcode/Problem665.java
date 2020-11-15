package dev.juho.leetcode;

import java.util.Arrays;

public class Problem665 {

	public void solve() {
		int[] first = new int[]{4, 2, 3};
		System.out.println(Arrays.toString(first) + ": " + checkPossibility(first));

		int[] second = new int[]{4, 2, 1};
		System.out.println(Arrays.toString(second) + ": " + checkPossibility(second));

		int[] third = new int[]{3, 4, 2, 3};
		System.out.println(Arrays.toString(third) + ": " + checkPossibility(third));

		int[] fourth = new int[]{2, 3, 5, 3};
		System.out.println(Arrays.toString(fourth) + ": " + checkPossibility(fourth));

		int[] fifth = new int[]{-1, 4, 2, 3};
		System.out.println(Arrays.toString(fifth) + ": " + checkPossibility(fifth));

		int[] sixth = new int[]{2, 3, 3, 2, 2};
		System.out.println(Arrays.toString(sixth) + ": " + checkPossibility(sixth));
	}

	public boolean checkPossibility(int[] nums) {
		int changes = 0;
		for (int i = 1; i < nums.length - 1; i++) {
			int prev = nums[i - 1];
			int next = nums[i + 1];
			int curr = nums[i];

			// 0 1 2
			if (prev <= curr && curr <= next) {
				continue;
			}

			// 3 5 3
			if (prev == next) {
				changes++;
				if (changes >= 2) {
					return false;
				}
				continue;
			}

			if (prev <= curr) {
				changes++;
				if (changes >= 2) {
					return false;
				}
			}

			if (prev >= curr && curr <= next) {
				changes++;
				if (changes >= 2) {
					return false;
				}
			}

			// 4 3 3
			if (prev >= curr && curr == next) {
				return false;
			}

			// 5 4 3
			if (prev > curr && curr > next) {
				return false;
			}
		}

		return true;
	}

}
