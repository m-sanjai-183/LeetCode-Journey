LeetCode 141 — Linked List Cycle

📌 Problem

Given the head of a linked list, determine whether the linked list contains a cycle.

Return true if a cycle exists; otherwise, return false.

🧠 Approach

Use Floyd's Cycle Detection Algorithm using Slow and Fast Pointers.

slow moves one node at a time.
fast moves two nodes at a time.
If there is a cycle, slow and fast will eventually meet.
If fast reaches null, there is no cycle.

🔄 Basic Idea

slow → 1 step
fast → 2 steps

If cycle exists:
slow == fast → Cycle Found ✅

If fast reaches null:
No Cycle ❌

⏱️ Complexity

Time: O(n)
Space: O(1)

🔗 LeetCode

Problem: 141. Linked List Cycle
Language: Java
Topic: Linked List, Two Pointers, Cycle Detection

⭐ Key Concept: Floyd's Cycle Detection Algorithm = Slow Pointer + Fast Pointer
