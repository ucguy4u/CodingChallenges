package LeetCode.thirty.day.covid.LeetCodeChallenges;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers and an integer k, you need to find the total
 * number of continuous subarrays whose sum equals to k.
 * 
 * Example 1:
 * 
 * Input:nums = [1,1,1], k = 2 Output: 2
 * 
 * Note:
 * 
 * The length of the array is in range [1, 20,000]. The range of numbers in the
 * array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 * 
 */
public class SubarraySumEqualsK {

	public static void main(String args[]) {
		SubarraySumEqualsK obj = new SubarraySumEqualsK();
		int[] nums = { 1, 1, 1 };
		int k = 2;
		System.out.println(obj.subarraySum(nums, k));
	}

	public int subarraySum(int[] nums, int k) {
		int sum = 0, result = 0;
		Map<Integer, Integer> preSum = new HashMap<>();
		preSum.put(0, 1);

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (preSum.containsKey(sum - k)) {
				result += preSum.get(sum - k);
			}
			preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
		}

		return result;
	}

}
