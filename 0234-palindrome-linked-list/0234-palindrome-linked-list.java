/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!= null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode halfReverse = reverseList(slow.next);
        ListNode first = head;
        ListNode second = halfReverse;
        while(second!=null) {
            if(first.val!=second.val) {
                reverseList(halfReverse);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseList(halfReverse);
        return true;
    }
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while(curr!=null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null) {
                next = next.next;
            }
        }
        return prev;
    }
}