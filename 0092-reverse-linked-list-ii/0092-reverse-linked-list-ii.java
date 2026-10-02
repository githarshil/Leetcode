class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode before = null;
        ListNode tail = head;
        for (int i = 1; i < left; i++) {
            before = tail;
            tail = tail.next;
        }
        ListNode prev = null;
        ListNode curr = tail;
        for (int i = 0; i < right - left + 1; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tail.next = curr;
        if (before == null) {
            head = prev;
        } else {
            before.next = prev;
        }
        return head;
    }
}