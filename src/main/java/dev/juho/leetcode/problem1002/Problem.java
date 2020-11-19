package dev.juho.leetcode.problem1002;

import java.util.ArrayList;
import java.util.List;

public class Problem {

	public List<String> commonChars(String[] A) {
		boolean[] checked = new boolean[27];
		List<String> commonLetters = new ArrayList<>();

		for (String s : A) {
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				int cIndex = charIndex(c);

				if (checked[cIndex]) {
					continue;
				}

				int timesFound = timesFound(A, c);
				if (timesFound != 0) {
					for (int j = 0; j < timesFound; j++) {
						commonLetters.add(String.valueOf(c));
					}
				}

				checked[cIndex] = true;
			}
		}

		return commonLetters;
	}

	private int charIndex(char c) {
		return c - 'a';
	}

	private int timesFound(String[] A, char letter) {
		int timesFound = Integer.MAX_VALUE;

		for (String s : A) {
			int currentCount = 0;

			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);

				if (c == letter) {
					currentCount++;
				}
			}

			if (currentCount == 0) {
				return 0;
			}

			if (currentCount < timesFound) {
				timesFound = currentCount;
			}
		}

		return timesFound;
	}

}
