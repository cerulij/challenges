// Given an integer array sorted in ascending order, convert it to height-balanced BST

package Trees;

public class SortedArrayToBST {
  int[] nums;

  public TreeNode helper(int left, int right) {
    if (left > right) return null;

    // always choose left middle node as a root
    int p = (left + right) / 2;

    // preorder traversal: node -> left -> right
    TreeNode root = new TreeNode(nums[p]);

    root.left = helper(left, p - 1);
    root.right = helper(p + 1, right);

    return root;
  }

  public TreeNode sortedArrayToBST(int[] nums) {
    this.nums = nums;
    return helper(0, nums.length - 1);
  }

  public static void main (String[] args) {

    int[] nums = {-10, -3, 0, 5, 9};

    TreeNode root = new SortedArrayToBST().sortedArrayToBST(nums);

    // new TreeNode().inOrder(root);
  }


}
