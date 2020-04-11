/**
 * 
 */
package thirty.day.covid.LeetCodeChallenges;

/**
 * @author ucguy4u
 * 
 * 
 *         We have a collection of stones, each stone has a positive integer
 *         weight.
 * 
 *         Each turn, we choose the two heaviest stones and smash them together.
 *         Suppose the stones have weights x and y with x <= y. The result of
 *         this smash is:
 * 
 *         If x == y, both stones are totally destroyed; If x != y, the stone of
 *         weight x is totally destroyed, and the stone of weight y has new
 *         weight y-x.
 * 
 *         At the end, there is at most 1 stone left. Return the weight of this
 *         stone (or 0 if there are no stones left.)
 */
public class LastStoneWeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastStoneWeight obj = new LastStoneWeight();
		int[] stone = { 2, 7, 4, 1, 8, 1 };
		int res = obj.lastStoneWeight(stone);
		System.out.println(res);
	}

	public int lastStoneWeight(int[] stones) {
		int[] buckets = new int[1001];
		for (int i = 0; i < stones.length; i++) {
			buckets[stones[i]]++;
		}

		int slow = buckets.length - 1; // start from the big to small
		while (slow > 0) {
			// If the number of stones with the same size is even or zero,
			// these stones can be totally destroyed pair by pair or there is no such size
			// stone existing,
			// we can just ignore this situation.

			// When the number of stones with the same size is odd,
			// there should leave one stone which is to smash with the smaller size one.
			if (buckets[slow] % 2 != 0) {
				int fast = slow - 1;
				while (fast > 0 && buckets[fast] == 0) {
					fast--;
				}
				if (fast == 0)
					break;
				buckets[fast]--;
				buckets[slow - fast]++;
			}
			slow--;
		}
		return slow;
	}
}
