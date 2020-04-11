/**
 * 
 */
package thirty.day.covid.LeetCodeChallenges;

import java.util.Arrays;

/**
 * @author ucguy4u Given an array nums of n integers where n > 1, return an
 *         array output such that output[i] is equal to the product of all the
 *         elements of nums except nums[i].
 * 
 *         Example:
 * 
 *         Input: [1,2,3,4] Output: [24,12,8,6]
 * 
 *         Constraint: It's guaranteed that the product of the elements of any
 *         prefix or suffix of the array (including the whole array) fits in a
 *         32 bit integer.
 * 
 *         Note: Please solve it without division and in O(n).
 * 
 *         Follow up: Could you solve it with constant space complexity? (The
 *         output array does not count as extra space for the purpose of space
 *         complexity analysis.)
 * 
 */
public class ProductOfArrayExceptSelf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
		int[] nums = { 1, 2, 3, 4 };

		System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
	}

	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0, tmp = 1; i < nums.length; i++) {
			result[i] = tmp;
			tmp *= nums[i];
		}
		for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
			result[i] *= tmp;
			tmp *= nums[i];
		}
		return result;
	}

}
