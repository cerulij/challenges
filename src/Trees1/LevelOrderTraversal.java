// Given the root of the tree, return the level order traversal of its nodes' values
// Left to right, level by level
// (BFS)

package Trees1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
  List<List<Integer>> levels = new ArrayList<List<Integer>>();

  // Recursive
  public void helper(TreeNode node, int level) {
    // if the size of levels = the level (we start at level 0)
    if (levels.size() == level)
      // add a new list in levels
      levels.add(new ArrayList<Integer>());

    // put the value of the nodes of that level in the new list
    levels.get(level).add(node.val);

    // traverse the children from left to right
    if (node.left != null) {
      helper(node.left, level + 1);
    }

    if (node.right != null) {
      helper(node.right, level + 1);
    }
  }

  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) {
      return levels;
    }

    // we start at level 0
    helper(root, 0);
    return levels;
  }

  // Iterative
  public List<List<Integer>> levelOrderIterative(TreeNode root) {
    List<List<Integer>> levels = new ArrayList<List<Integer>>();
    if (root == null) {
      return levels;
    }

    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);
    int level = 0;

    while (!queue.isEmpty()) {
      // start the current level
      levels.add(new ArrayList<Integer>());

      // number of elements in the current level
      int level_length = queue.size();
      for(int i = 0; i < level_length; ++i) {
        TreeNode node = queue.remove();

        // fulfill the current level
        levels.get(level).add(node.val);

        // add child nodes of the current level
        // in the queue for the next level
        if (node.left != null) {
          queue.add(node.left);
        }

        if (node.right != null) {
          queue.add(node.right);
        }
      }

      // go to next level
      level++;
    }
    return levels;
  }

}
