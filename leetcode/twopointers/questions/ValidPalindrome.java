package leetcode.twopointers.questions;

/**
 * Valid Palindrome
 * ==================
 * https://leetcode.com/problems/valid-palindrome
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads the
 * same forward and backward. Alphanumeric characters include letters and
 * numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * Example 1:
 * ------------
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * Example 2:
 * ------------
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * 
 * Example 3:
 * ------------
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric
 * characters.
 * Since an empty string reads the same forward and backward, it is a
 * palindrome.
 * 
 * Constraints:
 * ------------
 * - 1 <= s.length <= 2 * 105
 * - s consists only of printable ASCII characters.
 */
public class ValidPalindrome {
    String reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;

        while (low <= high) {
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;

            low += 1;
            high -= 1;
        }

        return new String(s);
    }

    boolean isPalindrome(String s) {
        String cleanStr = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = reverseString(cleanStr.toCharArray());

        return cleanStr.equals(reversed);
    }
}
