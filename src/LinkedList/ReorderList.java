// Reorder two linked lists such that L0 -> Ln -> L1 -> Ln-1 -> L2 -> Ln-2

package LinkedList;

public class ReorderList {

  public void reorderList(ListNode head) {

    if (head == null) return;

    // get the middle of a linked list
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    ListNode temp = new ListNode();

    // reverse the second half of the linked list
    ListNode prev = null;
    ListNode curr = slow;
    while (curr != null) {
      temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;
    }

    // merge the first part and the reversed second half
    ListNode first = head;
    ListNode second = prev;
    while (second.next != null) {
      temp = first.next;
      first.next = second;
      first = temp;

      temp = second.next;
      second.next = first;
      second = temp;
    }
  }

}
