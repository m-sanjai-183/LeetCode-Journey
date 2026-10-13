# 🚀 LeetCode Day 12 — Power of Four

## 🧩 Problem Details
- **LeetCode Problem:** [342. Power of Four](https://leetcode.com/problems/power-of-four/)
- **Difficulty:** Easy
- **Language:** Java
- **Status:** Accepted ✅

## 📝 Problem Statement
Given an integer `n`, return `true` if it is a power of four. Otherwise, return `false`.

An integer `n` is a power of four if there exists an integer `x` such that `n == 4^x`.

### Example 1
**Input:** `n = 16`  
**Output:** `true`

### Example 2
**Input:** `n = 5`  
**Output:** `false`

### Example 3
**Input:** `n = 1`  
**Output:** `true`

## 💡 Approach
1. If `n <= 0`, return `false`. Powers of four are positive.
2. While `n` is divisible by `4`, divide `n` by `4`.
3. If the final value is `1`, the original number is a power of four. Otherwise, it is not.

## 💻 Solution
See [`Solution.java`](Solution.java).

## ⏱️ Complexity Analysis
- **Time Complexity:** `O(log₄ n)` — the value is divided by four in each loop iteration.
- **Space Complexity:** `O(1)` — only a constant amount of extra space is used.

## 📚 Key Learning
- Check special cases such as zero and negative numbers.
- Use the modulo operator (`%`) to check divisibility.
- Integer division (`/`) repeatedly reduces the number.

---
✨ **Day 12 of my coding journey — learning, practicing, and improving one problem at a time!**
