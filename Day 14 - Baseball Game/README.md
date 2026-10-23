# ⚾ LeetCode Day 14 — Baseball Game

## 🧩 Problem Details
- **LeetCode Problem:** [682. Baseball Game](https://leetcode.com/problems/baseball-game/)
- **Difficulty:** Easy
- **Language:** Java
- **Status:** Accepted ✅

## 📝 Problem Statement
Given a list of strings `operations`, apply each baseball score operation and return the sum of all valid scores.

- An integer: record that score.
- `+`: record the sum of the previous two scores.
- `D`: record double the previous score.
- `C`: remove the previous score.

## 💡 Approach
1. Store scores in an `ArrayList<Integer>`.
2. Parse and add numeric operations.
3. For `D`, add twice the last score.
4. For `+`, add the sum of the previous two scores.
5. For `C`, remove the last score.
6. Sum the remaining scores and return the result.

## 💻 Solution
See [`Solution.java`](Solution.java).

## ⏱️ Complexity Analysis
- **Time Complexity:** `O(n)` — process each operation and sum the scores.
- **Space Complexity:** `O(n)` — the list stores the scores.

## 📚 Key Learning
- Using `ArrayList<Integer>` for a changing list.
- Handling operations with conditional statements.
- Converting strings to integers with `Integer.parseInt()`.

---
✨ **Day 14 of my coding journey — learning, practicing, and improving one problem at a time!**
