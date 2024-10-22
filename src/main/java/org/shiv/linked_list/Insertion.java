package org.shiv.linked_list;

public class Insertion {
    ListNode insertNewNodeAtHead(ListNode head, ListNode newNode){
        newNode.next = head;
        return newNode;
    }
    ListNode insertValueAtHead(ListNode head, int val){
        return new ListNode(val,head);
    }
    ListNode insertAtEnd(ListNode head, int val){
        if(head == null){
            return new ListNode(val);
        }
        ListNode tmp = head;
        while (tmp.next!=null)
        {
            tmp = tmp.next;
        }
        tmp.next = new ListNode(val);
        return head;
    }
    ListNode insertAtKthPosition(ListNode head, int k, int val){
        if(head == null){
            if(k == 1){
                return new ListNode(val);
            }
        }
        if(k == 1){
            return new ListNode(val,head);
        }
        ListNode tmp = head;
        ListNode previous = null;
        int count = 0;
        while (tmp != null){
            count++;
            if(count == k){
                previous.next = new ListNode(val,tmp);
                break;
            }
            previous = tmp;
            tmp = tmp.next;
        }
        return head;
    }
    ListNode insertAtKthPositionWithoutPrevious(ListNode head, int k, int val){
        if(head == null){
            if(k == 1){
                return new ListNode(val);
            }
        }
        if(k == 1){
            return new ListNode(val,head);
        }
        ListNode tmp = head;
        int count = 0;
        while (tmp != null){
            count++;
            if(count == k-1){
                tmp.next = new ListNode(val, tmp.next);
                break;
            }
            tmp = tmp.next;
        }
        return head;
    }
    ListNode insertBeforeFirstOccurrenceOfValue(ListNode head, int value, int val) {
        if (head == null) {
            return head;
        }
        if (value == head.val) {
            return new ListNode(val, head);
        }
        ListNode tmp = head;
        while (tmp.next != null) {
            if (tmp.next.val == value) {
                tmp.next = new ListNode(val, tmp.next);
                break;
            }
            tmp = tmp.next;
        }
        return head;
    }
}
