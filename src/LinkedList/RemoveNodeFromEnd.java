// Remove the nth node from the end of a singly linked list

package LinkedList;

public class RemoveNodeFromEnd {

  public ListNode removeNthFromEnd(ListNode head, int n) {
      int count = 0;

      ListNode iterator = head;
      // count the linked list
      while (iterator != null) {
        count += 1;
        iterator = iterator.next;
      }

      // if n = count
      if (n == count) {
        // delete the head and return the next one
        if (head.next != null) {
          return head.next;
        } else {
          // if the head is the only node, return null
          return null;
        }
      }

      ListNode current = new ListNode();
      iterator = head;

      // also: while (i < (count - n))
      while (n < count) {
        current = iterator;
        iterator = iterator.next; // next
        count--;
      }

      current.next = iterator.next;

      return head;
  }

  public static void main (String[] args) {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;

    new RemoveNodeFromEnd().removeNthFromEnd(node1, 4);
  }


}
