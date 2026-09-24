LeetCode 83 — Remove Duplicates from Sorted List
Problem

Given the head of a sorted linked list, delete all duplicates so that each element appears only once.

Return the linked list after removing the duplicates.

Example

Input:

[1,1,2]

Output:

[1,2]
Approach

Since the linked list is sorted, duplicate values will always be next to each other.

We use a pointer p to traverse the list:

Start from the head.
Compare p.val with p.next.val.

If they are equal, skip the duplicate node using:

p.next = p.next.next;
Otherwise, move p to the next node.
Continue until the end of the list.
Return head.
Java Solution
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;

        while (p != null && p.next != null) {
            if (p.val == p.next.val)
                p.next = p.next.next;
            else
                p = p.next;
        }

        return head;
    }
}
Complexity
Time Complexity: O(n)
Space Complexity: O(1)
Key Concept

Because the list is sorted, duplicates are always adjacent.

So, we only need to compare the current node with the next node.

LeetCode

Problem: 83. Remove Duplicates from Sorted List
Difficulty: Easy
Language: Java
Topic: Linked List

Status: ✅ Accepted
