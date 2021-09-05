// A binary tree class

package Trees1;

public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {}

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public void print(TreeNode root) {
    if (root == null) {
      return;
    }

    print(root.left);
    System.out.println(root.val);
    print(root.right);
  }
}
