// Given the head of a singly linked list, return true if it is a palindrome

package LinkedList;

public class PalindromeLinkedList {

  public boolean isPalindrome(ListNode head) {
    ListNode iterator = head;
    int count = 0;

    while (iterator != null) {
      count++;
      iterator = iterator.next;
    }

    int[] arr = new int[count];

    iterator = head;
    count = 0;
    while (iterator != null) {
      arr[count] = iterator.val;
      iterator = iterator.next;
      count++;
    }

    int left = 0;
    int right = count - 1;

    while (left <= right) {
      if (arr[left] != arr[right]) {
        return false;
      }
      left++;
      right--;
    }

    return true;
  }


  public static void main (String[] args) {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(1);
    ListNode node3 = new ListNode(2);
    ListNode node4 = new ListNode(1);
//    ListNode node5 = new ListNode(1);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
//    node4.next = node5;


    System.out.println(new PalindromeLinkedList().isPalindrome(node1));

  }


}
