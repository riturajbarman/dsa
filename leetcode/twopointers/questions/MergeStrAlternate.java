package leetcode.twopointers.questions;

/**
 * Merge Strings Alternately
 * ===========================
 * https://leetcode.com/problems/merge-strings-alternately
 * 
 * You are given two strings word1 and word2. Merge the strings by adding
 * letters in alternating order, starting with word1. If a string is longer than
 * the other, append the additional letters onto the end of the merged string.
 * 
 * Return the merged string.
 * 
 * Example 1:
 * ------------
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1: a b c
 * word2: p q r
 * merged: a p b q c r
 * 
 * Example 2:
 * ------------
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * word1: a b
 * word2: p q r s
 * merged: a p b q r s
 * 
 * Example 3:
 * ------------
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * word1: a b c d
 * word2: p q
 * merged: a p b q c d
 * 
 * Constraints:
 * - 1 <= word1.length, word2.length <= 100
 * - word1 and word2 consist of lowercase English letters.
 */
public class MergeStrAlternate {
    String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;

        String result = "";

        while (i < word1.length() && j < word2.length()) {
            result = result + word1.charAt(i);
            result = result + word2.charAt(j);

            i += 1;
            j += 1;
        }

        while (i < word1.length()) {
            result = result + word1.charAt(i);

            i += 1;
        }

        while (j < word2.length()) {
            result = result + word2.charAt(j);

            j += 1;
        }

        return result;
    }
}
