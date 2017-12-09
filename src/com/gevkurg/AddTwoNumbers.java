package com.gevkurg;

public class AddTwoNumbers {
  public static ListNode addTwoNumbers(ListNode a, ListNode b) {
    if (a == null) {
      return b;
    }

    if (b == null) {
      return a;
    }

    int carry = 0;
    int sum = 0;
    ListNode current = null;
    ListNode head = null;

    while (a != null || b != null || carry != 0) {
      sum += a != null ? a.val : 0;
      sum += b != null ? b.val : 0;
      sum += carry;

      if (current == null) {
        current = new ListNode(sum % 10);
        head = current;
      } else {
        current.next = new ListNode(sum % 10);
        current = current.next;
      }

      carry = sum / 10;
      sum = 0;
      if (a != null) {
        a = a.next;
      }

      if (b != null) {
        b = b.next;
      }
    }

    return head;
  }
}
