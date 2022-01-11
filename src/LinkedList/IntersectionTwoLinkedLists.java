// Given the heads of two singly linked lists, return the node at which the two lists intersect

package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoLinkedLists {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    Set<ListNode> hs = new HashSet<>();

    while (headA != null) {
      hs.add(headA);
      headA = headA.next;
    }

    while (headB != null) {
      if (hs.contains(headB)) {
        return headB;
      }
      headB = headB.next;
    }

    return null;
  }

}
