LeetCode 2 — Add Two Numbers
📌 Problem

You are given two non-empty linked lists representing two non-negative integers.

Digits are stored in reverse order.
Each node contains a single digit.
Add the two numbers and return the sum as a linked list.

🧪 Example

Input
l1 = [2,4,3]
l2 = [5,6,4]

Output
[7,0,8]
Explanation
342 + 465 = 807

Since the digits are stored in reverse order:

[2,4,3] + [5,6,4] → [7,0,8]

🧠 Approach

Create a dummy node to build the answer list.
Use a pointer p to add new nodes.
Keep a carry for sums greater than 9.
Traverse both linked lists until both are finished and there is no carry.
Add the current values of l1 and l2.
Store sum % 10 in the result.
Update carry using sum / 10.
Move to the next nodes.
Return dummy.next.
⏱️ Complexity
Time: O(max(n, m))
Space: O(max(n, m)) for the output linked list.

💻 Java Solution

See Solution.java.

🔗 LeetCode

Problem: 2. Add Two Numbers
Difficulty: Medium
Topic: Linked List, Math

⭐ Key Concept: Linked List + Carry + Digit-by-Digit Addition
