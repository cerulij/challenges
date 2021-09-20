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

  // left, root, right
  public void inOrder(TreeNode root) {
    if (root == null) {
      return;
    }

    inOrder(root.left);
    System.out.println(root.val);
    inOrder(root.right);
  }

  // root, left, right
  public void preOrder(TreeNode root) {
    if (root == null) {
      return;
    }

    System.out.println(root.val);
    preOrder(root.left);
    preOrder(root.right);
  }

  // left, right, root
  public void postOrder(TreeNode root) {
    if (root == null) {
      return;
    }

    postOrder(root.left);
    postOrder(root.right);
    System.out.println(root.val);
  }
}
