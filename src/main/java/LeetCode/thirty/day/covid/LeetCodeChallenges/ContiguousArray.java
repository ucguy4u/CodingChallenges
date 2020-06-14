/**
 * 
 */
package LeetCode.thirty.day.covid.LeetCodeChallenges;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ucguy4u Given a binary array, find the maximum length of a contiguous
 *         subarray with equal number of 0 and 1.
 * 
 *         Example 1:
 * 
 *         Input: [0,1] Output: 2 Explanation: [0, 1] is the longest contiguous
 *         subarray with equal number of 0 and 1.
 * 
 *         Example 2:
 * 
 *         Input: [0,1,0] Output: 2 Explanation: [0, 1] (or [1, 0]) is a longest
 *         contiguous subarray with equal number of 0 and 1.
 * 
 *         Note: The length of the given binary array will not exceed 50,000.
 */
public class ContiguousArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContiguousArray obj = new ContiguousArray();
		int[] nums = { 0, 1, 0 };
		System.out.println(obj.findMaxLength(nums));
	}

	public int findMaxLength(int[] nums) {
		int[] cnt = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (i > 0)
				cnt[i] = cnt[i - 1];
			if (nums[i] == 1)
				cnt[i]++;
			else
				cnt[i]--;
		}
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int max = 0;
		for (int i = 0; i < cnt.length; i++) {
			if (map.containsKey(cnt[i]))
				max = Math.max(max, i - map.get(cnt[i]));
			if (!map.containsKey(cnt[i]))
				map.put(cnt[i], i);
		}
		return max;
	}
}
