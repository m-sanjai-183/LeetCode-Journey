# LeetCode 142 - Linked List Cycle II

This repository contains the Java solution for **LeetCode Problem 142: Linked List Cycle II**.

## Problem Statement

Given the `head` of a linked list, return the node where the cycle begins. If there is no cycle, return `null`.

You must solve it without modifying the linked list and using constant extra space.

### Example

Input:
head = [3,2,0,-4]
pos = 1

Output:
tail connects to node index 1

Explanation:
The tail node points back to the node with value `2`, creating a cycle.

---

## Approach

This solution uses **Floyd’s Cycle Detection Algorithm (Tortoise and Hare Algorithm)**.

### Steps:
1. Use two pointers:
   - `slow` → moves one step
   - `fast` → moves two steps
2. If both pointers meet, a cycle exists.
3. Move `slow` back to `head`.
4. Move both pointers one step at a time.
5. The node where they meet again is the starting point of the cycle.

---

## Time Complexity

- **Time:** O(n)
- **Space:** O(1)

---

