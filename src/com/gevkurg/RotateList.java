package com.gevkurg;

public class RotateList {
  public ListNode rotateRight(ListNode a, int b) {
    if (a == null || a.next == null) {
      return a;
    }

    ListNode n1 = a;
    ListNode n2 = a;

    int size = 0;

    while (n2 != null) {
      n2 = n2.next;
      ++size;
    }

    b = b % size;

    if (b == 0) {
      return a;
    }

    n2 = a;

    b = size - b - 1;

    while (n2 != null && b > 0) {
      n2 = n2.next;
      --b;
    }

    n1 = n2.next;
    n2.next = null;

    ListNode newHead = n1;

    while (n1.next != null) {
      n1 = n1.next;
    }

    n1.next = a;

    return newHead;
  }
}
