// Given two linked lists representing numbers in reversed order, add the two numbers
// and return the sum in reversed order

package LinkedList;

public class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    // create a dummy node to return dummy.next at the end
    ListNode dummyHead = new ListNode();
    ListNode curr = dummyHead;
    int carry = 0;

    while (l1 != null || l2 != null) {
      int x = (l1 != null) ? l1.val : 0;
      int y = (l2 != null) ? l2.val : 0;

      int sum = carry + x + y;

      // get the most significant digit of the sum
      carry = sum / 10;

      // get the least significant digit of the sum
      curr.next = new ListNode(sum % 10);

      curr = curr.next;

      if (l1 != null) l1 = l1.next;
      if (l2 != null) l2 = l2.next;
    }

    // if we still have a carry, we add a new node
    if (carry != 0) curr.next = new ListNode(carry);

    return dummyHead.next;
  }


}
