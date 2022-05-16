// Given a linked list of length n where each node contains an additional random pointer,
// construct a deep copy of the list.

package LinkedList;

import java.util.HashMap;

class Node {
  int val;
  Node next;
  Node random;

  public Node(int val) {
    this.val = val;
    this.next = null;
    this.random = null;
  }
}

public class CopyListWithRandomPointer {
  private HashMap<Node, Node> visited = new HashMap<>();


  public Node copyRandomList(Node head) {
    if (head == null) {
      return null;
    }

    // this stops the infinite cycle
    if (visited.containsKey(head)) {
      return visited.get(head);
    }

    Node clone = new Node(head.val);

    visited.put(head, clone);

    clone.next = copyRandomList(head.next);
    clone.random = copyRandomList(head.random);

    return clone;
  }

  public static void main (String[] args) {
    Node node4 = new Node(4);
    Node node7 = new Node(7);
    Node node2 = new Node(-2);

    node4.next = node7;
    node7.next = node2;
    node2.next = null;

    node4.random = node2;
    node7.random = node4;
    node2.random = null;

    new CopyListWithRandomPointer().copyRandomList(node4);
  }

}
