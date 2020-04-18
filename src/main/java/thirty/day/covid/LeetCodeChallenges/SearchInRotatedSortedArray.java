package thirty.day.covid.LeetCodeChallenges;

class SearchInRotatedSortedArray {

	public static void main(String args[]) {
		SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		System.out.println(obj.search(nums, target));

	}

	public int search(int[] nums, int target) {

		if (nums.length < 1) {
			return -1;
		}
		int lo = 0;
		int hi = nums.length - 1;
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (nums[mid] == target)
				return mid;

			if (nums[lo] <= nums[mid]) {
				if (target >= nums[lo] && target < nums[mid]) {
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}
			} else {
				if (target > nums[mid] && target <= nums[hi]) {
					lo = mid + 1;
				} else {
					hi = mid - 1;
				}
			}
		}
		return nums[lo] == target ? lo : -1;
	}
}