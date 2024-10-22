package org.shiv.linked_list;

import java.util.ArrayList;
import java.util.List;

public class Traversal {
    public List<Integer> LLTraversal(ListNode head) {
        List<Integer> outputList = new ArrayList<>();
        ListNode cur = head;
        while(cur != null){
            int val = cur.val;
            outputList.add(val);
            cur = cur.next;
        }
        return outputList;
    }
}
