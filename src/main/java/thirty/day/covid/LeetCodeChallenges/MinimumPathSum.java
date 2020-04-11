package thirty.day.covid.LeetCodeChallenges;

/**
 * 
 * @author ucguy4u Minimum Path Sum
 * 
 *         Given a m x n grid filled with non-negative numbers, find a path from
 *         top left to bottom right which minimizes the sum of all numbers along
 *         its path.
 * 
 *         Note: You can only move either down or right at any point in time.
 * 
 *         Example:
 * 
 *         Input: [ [1,3,1], [1,5,1], [4,2,1] ] Output: 7 Explanation: Because
 *         the path 1→3→1→1→1 minimizes the sum.
 * 
 * 
 */
public class MinimumPathSum {
	public static void main(String args[]) {
		MinimumPathSum obj = new MinimumPathSum();
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println(obj.minPathSum(grid));
	}

	public int minPathSum(int[][] grid) {
		if (grid.length == 0)
			return 0;

		int r = grid.length;
		int c = grid[0].length;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				int leftSum = (j > 0) ? grid[i][j - 1] : Integer.MAX_VALUE;
				int topSum = (i > 0) ? grid[i - 1][j] : Integer.MAX_VALUE;
				if (i == 0 && j == 0)
					continue;

				grid[i][j] += Math.min(leftSum, topSum);
			}
		}
		return grid[r - 1][c - 1];
	}
}