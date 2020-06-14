/**
 * 
 */
package LeetCode.thirty.day.covid.LeetCodeChallenges;

/**
 * @author ucguy4u You are given a string s containing lowercase English
 *         letters, and a matrix shift, where shift[i] = [direction, amount]:
 * 
 *         direction can be 0 (for left shift) or 1 (for right shift). amount is
 *         the amount by which string s is to be shifted. A left shift by 1
 *         means remove the first character of s and append it to the end.
 *         Similarly, a right shift by 1 means remove the last character of s
 *         and add it to the beginning.
 * 
 *         Return the final string after all operations.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: s = "abc", shift = [[0,1],[1,2]] Output: "cab" Explanation:
 *         [0,1] means shift to left by 1. "abc" -> "bca" [1,2] means shift to
 *         right by 2. "bca" -> "cab"
 * 
 *         Example 2:
 * 
 *         Input: s = "abcdefg", shift = [[1,1],[1,1],[0,2],[1,3]] Output:
 *         "efgabcd" Explanation: [1,1] means shift to right by 1. "abcdefg" ->
 *         "gabcdef" [1,1] means shift to right by 1. "gabcdef" -> "fgabcde"
 *         [0,2] means shift to left by 2. "fgabcde" -> "abcdefg" [1,3] means
 *         shift to right by 3. "abcdefg" -> "efgabcd"
 */
public class PerformStringShifts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		int[][] shift = { { 0, 1 }, { 1, 2 } };
		PerformStringShifts obj = new PerformStringShifts();
		System.out.println(obj.stringShift(s, shift));
		// System.out.println(obj.stringShiftOperator(s, shift));

	}
	/*
	 * Take single record at a time and perform single shift operaion depends on 0
	 * for left shift and 1 for right shift
	 */

	public String stringShift(String s, int[][] shift) {
		int len = s.length();
		for (int[] value : shift) {
			if (value[0] == 0) {
				// left shift
				s = s.substring(value[1] % len) + s.substring(0, value[1] % len);
			} else {
				// right shift
				s = s.substring(s.length() - value[1] % len) + s.substring(0, s.length() - value[1] % len);
			}
		}
		return s;
	}

	/*
	 * public String stringShiftOperator(String s, int[][] shift) { int rotateCount
	 * = 0;
	 * 
	 * for (int[] value : shift) { if (value[0] == 0) { rotateCount += value[1]; }
	 * else { rotateCount -= value[1]; }
	 * 
	 * } rotateCount = rotateCount % s.length(); if (rotateCount > 0) { // left
	 * shift s, rotatecount s = s.substring(rotateCount) + s.substring(0,
	 * rotateCount); } else if (rotateCount > 0) { // right shift s =
	 * s.substring(s.length() - rotateCount) + (s.substring(0, s.length() -
	 * (-rotateCount))); } return s; }
	 */
}
