LeetCode 896 — Monotonic Array
🧩 Problem
An array is monotonic if it is either:
Monotone Increasing
Monotone Decreasing
Given an integer array `nums`, return `true` if the array is monotonic, otherwise return `false`.
---
💡 Examples
Example 1
Input:
```text
nums = [1,2,2,3]
```
Output:
```text
true
```
Example 2
Input:
```text
nums = [6,5,4,4]
```
Output:
```text
true
```
Example 3
Input:
```text
nums = [1,3,2]
```
Output:
```text
false
```
---
🧠 Approach
We maintain two boolean variables:
`increasing` → checks whether the array is increasing.
`decreasing` → checks whether the array is decreasing.
For every adjacent pair `nums[i]` and `nums[i + 1]`:
Increasing Check
If:
```text
nums[i] > nums[i + 1]
```
the array cannot be increasing.
So:
```java
increasing = false;
```
Decreasing Check
If:
```text
nums[i] < nums[i + 1]
```
the array cannot be decreasing.
So:
```java
decreasing = false;
```
Finally:
```java
return increasing || decreasing;
```
If either condition is still true, the array is monotonic.
---
⏱️ Complexity
Time Complexity: `O(n)`
Space Complexity: `O(1)`
---
💻 Language
Java ☕
---
🎯 Key Learning
A monotonic array can move in only one direction:
```text
Increasing ↗️
[1,2,2,3]

or

Decreasing ↘️
[6,5,4,4]
```
Equal adjacent values are allowed.
---
🔗 LeetCode
Problem: 896. Monotonic Array
Platform: LeetCode
---
⭐ Solved as part of my LeetCode Journey.
