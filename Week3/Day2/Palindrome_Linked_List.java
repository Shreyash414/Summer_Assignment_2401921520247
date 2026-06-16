package Week3.Day2;

import Week3.ListNode;

import java.util.Stack;

public class Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (st.pop() != temp.val) {
                return false;
            }
            temp = temp.next;
        }
        if (st.isEmpty()) {
            return true;
        }

        return false;
    }
}
