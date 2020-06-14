/**
 * 
 */
package LeetCode.twopointers;

import java.util.Arrays;

/**
 * @author ucguy4u
 *
 *         Given an array of integers A sorted in non-decreasing order, return
 *         an array of the squares of each number, also in sorted non-decreasing
 *         order.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: [-4,-1,0,3,10] Output: [0,1,9,16,100]
 * 
 *         Example 2:
 * 
 *         Input: [-7,-3,2,3,11] Output: [4,9,9,49,121]
 * 
 * 
 * 
 *         Note:
 * 
 *         1 <= A.length <= 10000 -10000 <= A[i] <= 10000 A is sorted in
 *         non-decreasing order.
 *
 * 
 * 
 */
public class SquareOfSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SquareOfSortedArray obj = new SquareOfSortedArray();
		int[] A = { -4, -1, 0, 3, 10 };
		int[] ans = obj.sortedSquares(A);
		System.out.println("Input :" + Arrays.toString(ans));
		System.out.println("Output :" + Arrays.toString(ans));

	}

	public int[] sortedSquares(int[] A) {
		int n = A.length;
		int[] result = new int[n];
		int i = 0;
		int j = n - 1;
		for (int p = n - 1; p >= 0; p--) {
			// sorting the numbers as start compare with from first and last element in the
			// array
			if (Math.abs(A[i]) > Math.abs(A[j])) {
				// store the square of number
				result[p] = A[i] * A[i];
				i++;
			} else {
				// store the square of number
				result[p] = A[j] * A[j];
				j--;
			}
		}
		return result;
	}

}
