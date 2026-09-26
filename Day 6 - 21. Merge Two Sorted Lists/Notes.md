LeetCode 21 — Merge Two Sorted Lists
📌 Problem

Given two sorted linked lists list1 and list2, merge them into one sorted linked list.

Return the head of the merged linked list.

🧠 Main Idea

Use two pointers to compare the nodes of both linked lists.

list1: 1 → 2 → 4
list2: 1 → 3 → 4

Result:
       1 → 1 → 2 → 3 → 4 → 4
🔑 Important Variables
ListNode a = list1;
ListNode b = list2;
a → points to the current node of list1
b → points to the current node of list2
ListNode d = new ListNode(0);
ListNode p = d;
d → dummy node
p → pointer used to build the merged list
🔄 Step-by-Step Logic
Step 1: Create a Dummy Node
ListNode d = new ListNode(0);
ListNode p = d;

The dummy node makes it easier to construct the result without separately handling the first node.

Step 2: Compare Both Lists
while (a != null && b != null)

Continue while both lists contain nodes.

Step 3: Compare Values
if (a.val <= b.val)

If a has the smaller value:

p.next = a;
a = a.next;

Attach a to the result and move a forward.

Otherwise:

p.next = b;
b = b.next;

Attach b and move b forward.

Step 4: Move the Result Pointer
p = p.next;

Move p to the newly added node.

Step 5: Attach Remaining Nodes

When one list becomes empty:

p.next = (a != null) ? a : b;

The remaining nodes are already sorted, so attach them directly.

Step 6: Return the Result
return d.next;

The dummy node itself is not part of the answer, so return d.next.

🧪 Dry Run
List 1: 1 → 2 → 4
List 2: 1 → 3 → 4
Comparison	Selected	Result
1 ≤ 1	1 from list1	1
2 > 1	1 from list2	1 → 1
2 ≤ 3	2 from list1	1 → 1 → 2
4 > 3	3 from list2	1 → 1 → 2 → 3
4 ≤ 4	4 from list1	1 → 1 → 2 → 3 → 4
Remaining	4	1 → 1 → 2 → 3 → 4 → 4
Final Output
[1,1,2,3,4,4]
⏱️ Complexity
Time Complexity
O(n + m)

Each node is visited once.

Space Complexity
O(1)

Only pointers are used; no new list is created.

⭐ Key Points to Remember
Two pointers → compare nodes from both lists.
Dummy node → makes linking easier.
p.next → connects the selected node.
Move the selected pointer → a = a.next or b = b.next.
Move p → p = p.next.
Attach remaining nodes at the end.
Return d.next, not d.
🔥 Pattern

This problem teaches an important Two Pointer + Linked List pattern.

Compare → Select → Link → Move → Repeat

LeetCode 21 = Merge Two Sorted Lists 🚀
