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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp!=null && temp.next!=null) {
            ListNode nex = temp.next;
            ListNode newNode = new ListNode(gcd(temp.val,nex.val));
            temp.next = newNode;
            newNode.next = nex;
            temp = temp.next.next;
        }
        return head;
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}