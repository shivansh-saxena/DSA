package org.shiv.linked_list;

public class Deletion {
    ListNode removeHead(ListNode head){
        if(head == null){
            return head;
        }
        return head.next;
    }
    ListNode removeTail(ListNode head){
        if(head == null || head.next == null){
            return null;
        }
        ListNode tmp = head;
        while (tmp.next.next!=null){
            tmp = tmp.next;
        }
        //at this point tmp is pointing to second last element
        tmp.next = null;
        return head;
    }
    ListNode removeKthElement(ListNode head, int k){
        if(head == null){
            return head;
        }
        if(k==1){
            return head.next;
        }
        ListNode tmp = head;
        ListNode previous = null;
        int count = 0;
        while (tmp != null){
            count++;
            if(count == k){
//                previous.next = tmp.next;
                previous.next = previous.next.next;
                break;
            }
            previous = tmp;
            tmp = tmp.next;
        }
        return head;
    }
    ListNode removeNodeWithValue(ListNode head, int value) {
        if (head == null) {
            return head;
        }
        if(head.val == value)
        {
            return head.next;
        }
        ListNode tmp = head;
        ListNode previous = null;
        while (tmp != null){
            if(tmp.val == value){
//                previous.next = tmp.next;
                previous.next = previous.next.next;
                break;
            }
            previous = tmp;
            tmp = tmp.next;
        }
        return head;
    }

}
