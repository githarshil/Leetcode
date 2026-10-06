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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode delNode = slow.next;
        slow.next = slow.next.next;
        return head;
    //     ListNode temp = head;
    //     int len = 0;
    //     while(temp!=null) {
    //         temp = temp.next;
    //         len++;
    //     }
    //     int before = len-n;
    //     if(before == 0) {
    //         ListNode res = head.next;
    //         return res;
    //     }
    //     ListNode del = head;
    //     while(before!=1){
    //         del = del.next;
    //         before--;
    //     }
    //     del.next = del.next.next;
    //     return head;
    }
}