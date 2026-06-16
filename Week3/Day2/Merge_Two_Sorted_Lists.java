package Week3.Day2;

import Week3.ListNode;

public class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode h1=list1;
        ListNode h2=list2;
        ListNode curr=new ListNode(Integer.MIN_VALUE);

        ListNode temp=curr;
        while(h1!=null && h2!=null){
            if(h1.val<=h2.val){
                temp.next=h1;
                temp=temp.next;
                h1=h1.next;
            }
            else{
                temp.next=h2;
                temp=temp.next;
                h2=h2.next;
            }
        }
        if(h1==null && h2!=null){
            while(h2!=null){
                temp.next=h2;
                temp=temp.next;
                h2=h2.next;
            }
        }
        else if(h1!=null && h2==null){
            while(h1!=null){
                temp.next = h1;
                temp=temp.next;
                h1=h1.next;
            }
        }
        return curr.next;
    }
}
