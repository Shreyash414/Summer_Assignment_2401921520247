package Week3.Day1;

import Week3.ListNode;

public class Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        // HashMap<ListNode,Integer> map= new HashMap<>();
        // ListNode temp=head;
        // int i=0;
        // while(temp!=null){
        //     i++;
        //     if(map.containsKey(temp)){
        //         return true;
        //     }
        //     else{map.put(temp,i);}
        //     temp=temp.next;
        // }
        // return false;
        ListNode slow= head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
