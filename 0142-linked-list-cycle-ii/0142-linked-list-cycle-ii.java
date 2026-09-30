/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = length(slow,fast);
        if(length == 0) {
            return null;
        }
        while(length!=0) {
            slow = slow.next;
            length--;
        }
        if (slow == fast) {
            return head;
        }
        while(fast!=null && fast.next!=null) {
            fast = fast.next;
            slow = slow.next;
            if(slow==fast) {
                return slow;
            }
        }
        return null;
    }
    public int length(ListNode fast,ListNode slow) {
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while(temp!=slow);
                return length;
            }
        }
        return 0;
    }
}