package dev.juho.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem221 {

	public void solve() {

	}

	/*
	Design a data structure that supports adding new words and finding if a string
	matches any previously added string.

	Implement the WordDictionary class:

	* WordDictionary() Initializes the object.
	* void addWord(word) Adds word to the data structure, it can be matched later.
	* bool search(word) Returns true if the is any string in the data structure
						that matches word or false otherwise. word may contain
						'.' where dots can be matched with nay letter.


	Example:

	Input
	["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
	[[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
	Output
	[null,null,null,null,false,true,true,true]

	Explanation
	WordDictionary wordDictionary = new WordDictionary();
	wordDictionary.addWord("bad");
	wordDictionary.addWord("dad");
	wordDictionary.addWord("mad");
	wordDictionary.search("pad"); // return False
	wordDictionary.search("bad"); // return True
	wordDictionary.search(".ad"); // return True
	wordDictionary.search("b.."); // return True
	 */

	class WordDictionary {

		HashMap<String, SearchNode> rootNodes;

		/**
		 * Initialize your data structure here.
		 */
		public WordDictionary() {
			this.rootNodes = new HashMap<>();
		}

		/**
		 * Adds a word into the data structure.
		 */
		public void addWord(String word) {

		}

		/**
		 * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
		 */
		public boolean search(String word) {

		}

		private void createNodes(String word) {
			SearchNode rootNode = rootNodes.get(word.charAt(0));

			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);

				if (rootNode == null) {
					rootNode = new SearchNode(c);
					continue;
				}


			}
		}
	}

	private static class SearchNode {
		public char c;
		List<SearchNode> children;

		public SearchNode(char c) {
			this.c = c;
			this.children = new ArrayList<>();
		}

		public SearchNode find(char c) {
			for (SearchNode x : children) {
				if (x.c == c) {
					return x;
				}
			}

			return null;
		}

	}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */

}
