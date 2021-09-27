// Given the root, find the maximum depth of a binary tree
// (DFS recursively)

package Trees;

public class MaxDepthBinaryTree {

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int left = maxDepth(root.left);
    int right = maxDepth(root.right);

    return (Math.max(left, right)) + 1;
  }

  public static void main (String[] args) {
    TreeNode root = new TreeNode(3);

    TreeNode node9 = new TreeNode(9);
    TreeNode node20 = new TreeNode(20);
    TreeNode node15 = new TreeNode(15);
    TreeNode node7 = new TreeNode(7);

    root.left = node9;
    root.right = node20;

    node9.left = null;
    node9.right = null;

    node20.left = node15;
    node20.right = node7;

    System.out.println(new MaxDepthBinaryTree().maxDepth(root));
  }


}
