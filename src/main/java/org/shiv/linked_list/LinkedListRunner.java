package org.shiv.linked_list;

public class LinkedListRunner {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(4,l1);
        ListNode l3 = new ListNode(3,l2);
        ListNode l4 = new ListNode(2,l3);
        ListNode l5 = new ListNode(1,l4);
        LinkedListRunner linkedListRunner = new LinkedListRunner();
        ListUtil.printLinkedList(l5);
        Insertion insertion =  new Insertion();
        l5 = insertion.insertBeforeFirstOccurrenceOfValue(l5,7,55);
        ListUtil.printLinkedList(l5);

    }
}
