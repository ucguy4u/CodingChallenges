/**
 * 
 */
package thirty.day.covid.LeetCodeChallenges;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ucguy4u
 *
 *
 *         Given an integer array arr, count element x such that x + 1 is also
 *         in arr.
 * 
 *         If there're duplicates in arr, count them seperately.
 * 
 *         Example 1:
 * 
 *         Input: arr = [1,2,3] Output: 2 Explanation: 1 and 2 are counted cause
 *         2 and 3 are in arr.
 * 
 *         Example 2:
 * 
 *         Input: arr = [1,1,3,3,5,5,7,7] Output: 0 Explanation: No numbers are
 *         counted, cause there's no 2, 4, 6, or 8 in arr.
 * 
 *         Example 3:
 * 
 *         Input: arr = [1,3,2,3,5,0] Output: 3 Explanation: 0, 1 and 2 are
 *         counted cause 1, 2 and 3 are in arr.
 * 
 *         Example 4:
 * 
 *         Input: arr = [1,1,2,2] Output: 2 Explanation: Two 1s are counted
 *         cause 2 is in arr.
 * 
 *         Constraints:
 * 
 *         1 <= arr.length <= 1000 0 <= arr[i] <= 1000
 *
 */
public class CountingElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CountingElement sol = new CountingElement();
		int[] arr = { 1, 2, 3 };
		sol.countElements(arr);
	}

	private int countElements(int[] arr) {
		/*
		 * lookup time in set O(1) and it does not contain duplicate elements.
		 */
		Set<Integer> setint = new HashSet();
		for (int val : arr) {
			setint.add(val);
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			/*
			 * If element is present then increment the count
			 */
			if (setint.contains(arr[i] + 1)) {
				count++;
			}
		}
		return count;

	}

}
