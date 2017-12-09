package com.gevkurg;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        /*
        ListNode listNode1 = new ListNode(9);
        listNode1.next = new ListNode(9);
        listNode1.next.next = new ListNode(1);

        ListNode listNode2 = new ListNode(1);
        ListNode ls = AddTwoNumbers.addTwoNumbers(listNode1, listNode2);
        */

        /*
        ArrayList<Integer> array = new ArrayList<> (Arrays.asList(9, 5, 4, 9, 3, 6, 8, 7, 1, 2, 8, 7, 2, 9, 7, 1, 3, 9, 7, 8, 1, 0, 5, 5));
        ArrayList<Integer> result = EqualSumTuple.equal(array);
        */

        ArrayList<Integer> array = new ArrayList<> (Arrays.asList(77, 28, 19, 21, 67, 15, 53, 25, 82, 52, 8, 94, 50, 30, 37, 39, 9, 43, 35, 48, 82, 53, 16, 20, 13, 95, 18, 67, 77, 12, 93, 0));
        DiffK2.diffPossible(array, 53);
    }
}