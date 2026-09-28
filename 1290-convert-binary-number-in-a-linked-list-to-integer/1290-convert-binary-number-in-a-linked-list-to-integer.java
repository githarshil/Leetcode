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
    public int getDecimalValue(ListNode head) {
        ListNode temp1 = head;
        int size =0;
        while(temp1!=null) {
            temp1 = temp1.next;
            size++;
        }
        int[] res = new int[size];
        ListNode temp = head;
        int i = 0;
        while(temp!=null) {
            res[i] = temp.val;
            temp = temp.next;
            i++;
        }
        int ans = 0;
        for(int j =0;j<res.length;j++) {
            ans = ans*2 + res[j];
        }
        return ans;
    }
}