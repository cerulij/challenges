// Delete a node without knowing the head of the singly linked list

package LinkedList1;

public class DeleteNode {

  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }


  public static void main (String[] args) {
    ListNode node1 = new ListNode(4);
    ListNode node2 = new ListNode(5);
    ListNode node3 = new ListNode(1);
    ListNode node4 = new ListNode(9);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;

    ListNode iterator = node1;

    new DeleteNode().deleteNode(node3);

    while (iterator != null) {
      System.out.println(iterator.val);
      iterator = iterator.next;
    }
  }

}


