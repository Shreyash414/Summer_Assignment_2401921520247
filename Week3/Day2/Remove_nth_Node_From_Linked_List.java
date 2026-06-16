package Week3.Day2;

import Week3.ListNode;

public class Remove_nth_Node_From_Linked_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int siz=0;
        while(temp!=null){
            siz++;
            temp=temp.next;
        }
        if(siz==0){
            return head;
        }

        else if(n==siz){
            head=head.next;
            return head;
        }
        else if(n>siz){
            return head ;
        }
        int pos=(siz-n);
        temp=head;
        ListNode temp1=temp.next;
        for(int i=1;i<pos;i++){
            temp=temp.next;
            temp1=temp.next;
        }
        if (temp1==null){return head;}
        temp.next=temp1.next;
        temp1.next=null;
        return head;

    }
}
