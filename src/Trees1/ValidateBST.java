// Given the root of a binary tree, determine if it is a valid BST
// Inorder traversal using a stack
// (DFS iterative)

package Trees1;

import java.util.ArrayList;
import java.util.List;

public class ValidateBST {

  public boolean isValidBST(TreeNode root) {
    List<TreeNode> res = new ArrayList<>();
    List<TreeNode> stack = new ArrayList<>();

    TreeNode curr = root;

    while (!stack.isEmpty() || curr != null) {

      while (curr != null) {
        stack.add(curr);
        curr = curr.left;
      }

      curr = stack.remove(stack.size() - 1);

      res.add(curr);

      curr = curr.right;
    }

    int j = 1;
    for (int i = 0; i < res.size() - 1; i++) {
      if (res.get(j).val <= res.get(i).val) {
        return false;
      }
      j++;
    }

    return true;
  }


  public boolean isValidBSTAgain(TreeNode root) {
    List<TreeNode> stack = new ArrayList<>();
    Integer prev = null;
    TreeNode curr = root;

    while (!stack.isEmpty() || curr != null) {

      while (curr != null) {
        stack.add(curr);
        curr = curr.left;
      }

      root = stack.remove(stack.size() - 1);

      if (prev != null && root.val <= prev) {
        return false;
      }

      prev = root.val;
      curr = root.right;
    }

    return true;
  }



  public static void main (String[] args) {
    TreeNode root = new TreeNode(5);

    TreeNode node1 = new TreeNode(1);
    TreeNode node4 = new TreeNode(4);
    TreeNode node3 = new TreeNode(3);
    TreeNode node6 = new TreeNode(6);

    root.left = node1;
    root.right = node4;

    node1.left = null;
    node1.right = null;

    node4.left = node3;
    node4.right = node6;

    TreeNode root2 = new TreeNode(2);
    TreeNode nodeL = new TreeNode(1);
    TreeNode nodeR = new TreeNode(3);

    root2.left = nodeL;
    root2.right = nodeR;

    System.out.println(new ValidateBST().isValidBSTAgain(root));
  }
}
