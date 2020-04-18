package thirty.day.covid.LeetCodeChallenges;

/**
 * Definition for a binary tree node.
 */
class ConstructBinarySearchTreefromPreorderTraversal {

	public static void main(String args[]) {
		ConstructBinarySearchTreefromPreorderTraversal obj = new ConstructBinarySearchTreefromPreorderTraversal();
		int[] preorder = { 8, 5, 1, 7, 10, 12 };
		obj.bstFromPreorder(preorder);
	}

	int i = 0;

	public TreeNode bstFromPreorder(int[] preorder) {
		return bstFromPreorder(preorder, Integer.MAX_VALUE);
	}

	public TreeNode bstFromPreorder(int[] preorder, int bound) {
		if (i == preorder.length || preorder[i] > bound)
			return null;
		TreeNode root = new TreeNode(preorder[i++]);
		root.left = bstFromPreorder(preorder, root.val);
		root.right = bstFromPreorder(preorder, bound);
		return root;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}