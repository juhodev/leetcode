package dev.juho.leetcode.problem1002;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

	@Test
	void testCommonCharsExampleOne() {
		String[] A = new String[]{"bella", "label", "roller"};

		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("e", "l", "l"));

		assertEquals(list, new Problem().commonChars(A));
	}

	@Test
	void testCommonCharsExampleTwo() {
		String[] A = new String[]{"cool","lock","cook"};

		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("c","o"));

		assertEquals(list, new Problem().commonChars(A));
	}

}