package org.shiv.linked_list;

public class ListUtil {
    static void printLinkedList(ListNode head){
        ListNode tmp = head;
        if(tmp != null && tmp.next !=null){
            while (tmp.next != null){
                System.out.print(tmp.val+" , ");
                tmp=tmp.next;
            }
            System.out.println(tmp.val);
        }
        else if(tmp != null)
        {
            System.out.println(tmp.val);
        }
    }
}
