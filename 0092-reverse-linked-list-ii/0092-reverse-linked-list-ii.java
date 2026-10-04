class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) {
            return head;
        }
        if(left == right) {
            return head;
        }
        int pos = 1;
        ListNode t = head;
        // getting before
        ListNode before = null;
            while(pos<left) {
                before = t;
                t = t.next;
                pos++;
            }
        //reversing
        ListNode curr = t;
        ListNode prev = null;
        int time  = right-left+1;
        while(time>0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            time--;
        }
        t.next = curr;
        if(before == null) {
        return prev;
        }
        before.next = prev;
        return head; 
    }
}