package leetcode.twopointers.questions;

/**
 * Valid Palindrome II
 * =====================
 * https://leetcode.com/problems/valid-palindrome-ii
 * 
 * Given a string s, return true if the s can be palindrome after deleting at
 * most one character from it.
 * 
 * Example 1:
 * ------------
 * Input: s = "aba"
 * Output: true
 * 
 * Example 2:
 * ------------
 * Input: s = "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.
 * 
 * Example 3:
 * ------------
 * Input: s = "abc"
 * Output: false
 * 
 * Constraints:
 * ------------
 * - 1 <= s.length <= 105
 * - s consists of lowercase English letters.
 */
public class ValidPalindromeII {
    boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }

            low++;
            high--;
        }
        return true;
    }

    boolean validPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return isPalindrome(s, low + 1, high) || isPalindrome(s, low, high - 1);
            }

            low++;
            high--;
        }

        return true;
    }
}
