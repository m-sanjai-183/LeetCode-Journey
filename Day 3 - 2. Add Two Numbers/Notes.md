Notes - LeetCode 2: Add Two Numbers

1. Main Idea

The numbers are stored in reverse order, so we can add them from left to right just like normal column addition.

Example:

l1 = [2,4,3]  → 342
l2 = [5,6,4]  → 465

342 + 465 = 807

Answer = [7,0,8]

2. Why carry is needed

If the sum is greater than 9, we keep the last digit and carry the remaining value.

Example:

8 + 7 = 15

digit  = 15 % 10 = 5
carry  = 15 / 10 = 1

So:

carry = sum / 10;
p.next = new ListNode(sum % 10);

3. Dummy Node

We create:

ListNode d = new ListNode(0);
ListNode p = d;

The dummy node makes it easy to build the result without handling the first node separately.

At the end:

return d.next;

We skip the dummy node.

4. Loop Condition

while (l1 != null || l2 != null || carry != 0)

Continue while:

l1 still has nodes, OR

l2 still has nodes, OR

a carry is remaining.

This also handles cases like:

[9,9] + [1] = [0,0,1]

5. Adding the First List

if (l1 != null) {
    sum += l1.val;
    l1 = l1.next;
}

If l1 has a node:

Add its value.

Move l1 to the next node.

6. Adding the Second List

if (l2 != null) {
    sum += l2.val;
    l2 = l2.next;
}

Same process for l2.

7. Create Result Node

p.next = new ListNode(sum % 10);
p = p.next;

sum % 10 gives the digit that should be stored in the current node.

Then move p forward.

8. Complete Logic

Start
  ↓
Create dummy node
  ↓
Set carry = 0
  ↓
Take values from l1 and l2
  ↓
Add values + carry
  ↓
Store sum % 10
  ↓
Update carry = sum / 10
  ↓
Move pointers
  ↓
Repeat
  ↓
Return dummy.next

9. Important Java Syntax

Create a node

new ListNode(value)

Creates a new linked-list node.

Move to next node

l1 = l1.next;

Get node value

l1.val

Get last digit

sum % 10

Get carry

sum / 10

10. Complexity

If n and m are the lengths of the two lists:

Time  : O(max(n, m))
Space : O(max(n, m))

The algorithm visits each node once.

11. Key Point to Remember

Add digit → store sum % 10 → update carry = sum / 10 → move forward.
