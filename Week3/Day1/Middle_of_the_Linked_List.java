package Week3.Day1;

import Week3.ListNode;

public class Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        ListNode temp1=head;
        while(temp1.next!=null && temp1.next.next !=null){
            temp1=temp1.next.next;
            temp=temp.next;
        }
        if(temp1.next!=null){
            temp=temp.next;
        }
        return temp;
    }
}
