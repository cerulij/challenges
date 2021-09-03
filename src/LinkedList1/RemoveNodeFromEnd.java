// Remove node from the end of a singly linked list using two pointer technique

package LinkedList1;

public class RemoveNodeFromEnd {

  public ListNode removeNthFromEnd(ListNode head, int n) {
      int count = 0;

      ListNode iterator = head;
      while (iterator != null) {
        count += 1;
        iterator = iterator.next;
      }

      iterator = head;
      if (n == count) {
        if (head.next != null) {
          return head.next;
        } else {
          return null;
        }
      }

      ListNode temp = new ListNode(0);
      while (n < count) {
        temp = iterator;
        iterator = iterator.next;
        count--;
      }

      temp.next = iterator.next;

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

    System.out.println(new RemoveNodeFromEnd().removeNthFromEnd(node1, 2));

  }


}
