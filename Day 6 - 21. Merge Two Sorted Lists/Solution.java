class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode d = new ListNode(0);
        ListNode p = d;

        while (a != null && b != null) {
            if (a.val <= b.val) {
                p.next = a;
                a = a.next;
            } else {
                p.next = b;
                b = b.next;
            }
            p = p.next;
        }

        p.next = (a != null) ? a : b;

        return d.next;
    }
}
