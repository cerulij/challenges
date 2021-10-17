// Given two integer arrays preorder and inorder, construct a binary tree

package Trees;

import java.util.HashMap;

public class BinaryTreeFromPreorderInorder {
  private int[] preorder;
  private int rootIndex;
  HashMap<Integer, Integer> hm;

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    this.preorder = preorder;
    // rootIndex keeps track of the root of every tree in preorder[]
    this.rootIndex = 0;
    // create a hashmap to find faster the root of the tree in inorder and return its index
    this.hm = new HashMap<>();

    for (int i = 0; i < inorder.length; i++) {
      hm.put(inorder[i], i);
    }

    return helper(0, preorder.length - 1);
  }

  public TreeNode helper(int left, int right) {
    if (left > right) {
      return null;
    }

    // the root value comes from preorder[rootIndex]
    int rootValue = preorder[rootIndex];
    // increment rootIndex to find the next root for the next tree
    rootIndex++;
    // create the TreeNode
    TreeNode root = new TreeNode(rootValue);

    // the left subtree goes from left to the index BEFORE the root found in inorder[]
    root.left = helper(left, hm.get(rootIndex) - 1);

    // the right subtree goes from the index AFTER the found in inorder[] to the right
    root.right = helper(hm.get(rootIndex) + 1, right);

    // when all the stacks calls are done, we get the first root
    return root;
  }

}
