LeetCode 21 — Merge Two Sorted Lists
📌 Problem

You are given the heads of two sorted linked lists, list1 and list2.

Merge the two lists into one sorted linked list by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

💡 Example
Input
list1 = [1,2,4]
list2 = [1,3,4]
Output
[1,1,2,3,4,4]
🧠 Approach
Create a dummy node to simplify the linked-list construction.
Use a pointer p to build the merged list.
Compare the current values of a and b.
Attach the smaller node to p.
Move the selected list pointer forward.
Move p to the newly added node.
When one list becomes empty, attach the remaining nodes of the other list.
Return d.next as the head of the merged list.
💻 Java Solution
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
⏱️ Complexity
Time Complexity: O(n + m)
Space Complexity: O(1)

Where:

n = number of nodes in list1
m = number of nodes in list2
📚 Concepts Learned
Linked Lists
Two Pointer Technique
Dummy Node
Node Linking
Traversal
Conditional Logic
🔗 LeetCode

Problem: 21. Merge Two Sorted Lists

Difficulty: Easy

⭐ Part of my Java & DSA learning journey.

#LeetCode #Java #DSA #LinkedList #ProblemSolving
