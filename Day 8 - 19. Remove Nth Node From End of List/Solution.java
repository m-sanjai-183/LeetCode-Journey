class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode d = new ListNode(0);
        d.next = head;

        ListNode p = d;
        ListNode q = d;

        for (int i = 0; i < n; i++) {
            q = q.next;
        }

        while (q.next != null) {
            p = p.next;
            q = q.next;
        }

        p.next = p.next.next;

        return d.next;
    }
}
