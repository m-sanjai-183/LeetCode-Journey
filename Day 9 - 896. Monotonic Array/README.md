# LeetCode 896 — Monotonic Array

## 🧩 Problem

An array is **monotonic** if it is either:

- Monotone Increasing
- Monotone Decreasing

Given an integer array `nums`, return `true` if the array is monotonic, otherwise return `false`.

---

## 💡 Example

### Example 1

**Input:**

nums = [1,2,2,3]

Output:

true
Example 2

Input:

nums = [6,5,4,4]

Output:

true
Example 3

Input:

nums = [1,3,2]

Output:

false
🧠 Approach

We maintain two boolean variables:

increasing → checks whether the array is increasing.
decreasing → checks whether the array is decreasing.

For every adjacent pair:

nums[i] and nums[i + 1]
Increasing Check

If:

nums[i] > nums[i + 1]

the array cannot be increasing.

So:

increasing = false;
Decreasing Check

If:

nums[i] < nums[i + 1]

the array cannot be decreasing.

So:

decreasing = false;

Finally:

return increasing || decreasing;

If either condition is still true, the array is monotonic.

⏱️ Complexity

Time Complexity: O(n)

Space Complexity: O(1)

💻 Language

Java ☕

🎯 Key Learning

A monotonic array can be:

Increasing ↗️
[1,2,2,3]

or

Decreasing ↘️
[6,5,4,4]

Equal adjacent values are allowed.
