LeetCode 142 — Linked List Cycle II

Problem

Given the head of a linked list, find the node where the cycle begins.

If there is no cycle, return null.

Approach — Floyd's Cycle Detection

Use two pointers:

slow → moves 1 step

fast → moves 2 steps

Step 1: Detect the Cycle

slow = slow.next;
fast = fast.next.next;

If slow == fast, a cycle exists.

Step 2: Find the Cycle Start

After detecting the cycle:

slow = head;

Then move both pointers one step at a time:

slow = slow.next;
fast = fast.next;

When they meet again, that node is the starting node of the cycle.

Example

3 → 2 → 0 → -4
    ↑         ↓
    ← ← ← ← ← ←

The cycle starts at node 2.

Complexity

Time: O(n)

Space: O(1)

Key Points

slow moves 1 step.

fast moves 2 steps.

If they meet, a cycle exists.

Reset slow to head.

Move both pointers 1 step at a time.

Their next meeting point is the cycle starting node.

Algorithm

Floyd's Cycle Detection Algorithm

Also called the Tortoise and Hare Algorithm.

Topics

Linked List

Two Pointers

Fast and Slow Pointer

Cycle Detection

Floyd's Algorithm
