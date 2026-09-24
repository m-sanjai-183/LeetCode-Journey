Notes — LeetCode 83: Remove Duplicates from Sorted List
1. Problem Understanding

We are given a sorted linked list.

We need to remove duplicate values so that every value appears only once.

Example
Input:
1 → 1 → 2 → 3 → 3

Output:
1 → 2 → 3
2. Important Point

Because the linked list is sorted, duplicate values will always be next to each other.

So, we only need to compare:

current node ↔ next node
3. Logic

Use a pointer:

ListNode p = head;

Then check:

p.val == p.next.val
If values are equal

Remove the duplicate node:

p.next = p.next.next;

Example:

1 → 1 → 2
↑   ↑
p   duplicate

After:

1 → 2
If values are different

Move to the next node:

p = p.next;
4. Algorithm
Start p at head.
Check whether p and p.next exist.
Compare their values.
If equal:
Skip the duplicate node.
Otherwise:
Move p forward.
Repeat until the end.
Return head.
5. Code
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
6. Dry Run
Input
1 → 1 → 2
Step 1
p = 1
p.next = 1

1 == 1

Duplicate found.

p.next = p.next.next;

List becomes:

1 → 2
Step 2
p = 1
p.next = 2

1 != 2

Move forward:

p = p.next;
Step 3

p.next == null

Loop stops.

Result
1 → 2
7. Important Syntax
p.val

Gets the value of the current node.

p.val
p.next

Gets the next node.

p.next
p.next.next

Gets the node after the next node.

p → p.next → p.next.next
Removing a duplicate
p.next = p.next.next;

This makes the current node point directly to the node after the duplicate.

8. Edge Cases
Empty list
[]

Return:

[]
One node
[1]

Return:

[1]
No duplicates
[1,2,3]

Return:

[1,2,3]
All duplicates
[1,1,1,1]

Return:

[1]
9. Complexity

Time Complexity:

O(n)

Each node is processed at most a small number of times.

Space Complexity:

O(1)

No extra data structure is used.

10. Key Takeaway

Sorted Linked List → duplicates are adjacent → compare current node with next node → skip duplicate using p.next = p.next.next.

Remember this pattern:
if (p.val == p.next.val)
    p.next = p.next.next;
else
    p = p.next;
