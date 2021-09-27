// Given the head of a singly linked list, reverse it

package LinkedList;

public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
      ListNode temp = curr.next;

      curr.next = prev;

      prev = curr;

      curr = temp;
    }

    return prev;
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

    ListNode iterator = new ReverseLinkedList().reverseList(node1);

    while (iterator != null) {
      System.out.println(iterator.val);
      iterator = iterator.next;
    }

  }

}



