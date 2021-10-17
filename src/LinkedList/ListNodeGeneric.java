// Generic singly linked list

package LinkedList;

import java.util.List;

public class ListNodeGeneric<T> {
  private T val;
  private ListNodeGeneric<T> next;

  public ListNodeGeneric(T val) {
    this.val = val;
  }

  public ListNodeGeneric(T val, ListNodeGeneric<T> next) {
    this.val = val;
    this.next = next;
  }


  public static void main (String[] args) {
    ListNodeGeneric<Integer> node1 = new ListNodeGeneric<>(2, null);

    ListNodeGeneric<Integer> head = new ListNodeGeneric<>(1, node1);
  }

}
