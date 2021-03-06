// Given the head of a singly linked list, return true if it has a cycle in it

package LinkedList;

import java.util.HashSet;

public class HasCycle {

  public boolean hasCycle(ListNode head) {
    HashSet<ListNode> hs = new HashSet<>();

    ListNode iterator = head;
    while (iterator != null) {
      if (hs.contains(iterator)) {
        return true;
      } else {
        hs.add(iterator);
        iterator = iterator.next;
      }
    }

    return false;
  }



  public static void main (String[] args) {
    ListNode node1 = new ListNode(3);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(0);
    ListNode node4 = new ListNode(4);
//    ListNode node5 = new ListNode(5);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
//    node4.next = node2;

    System.out.println(new HasCycle().hasCycle(node1));
  }

}
