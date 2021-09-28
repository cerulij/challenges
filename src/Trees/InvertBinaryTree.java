// Given the root of a binary tree, invert the tree
// (BFS iteratively)

package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

  public TreeNode invertTree(TreeNode root) {
    if (root == null) return null;

    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {
      TreeNode current = q.poll(); // or q.remove();

      TreeNode temp = current.left;

      current.left = current.right;
      current.right = temp;

      if (current.left != null) {
        q.add(current.left);
      }

      if (current.right != null) {
        q.add(current.right);
      }
    }

    return root;
  }


}
