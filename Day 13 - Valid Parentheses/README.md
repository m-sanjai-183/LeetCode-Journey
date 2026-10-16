# 🚀 LeetCode Day 13 — Valid Parentheses

## 🧩 Problem Details
- **LeetCode Problem:** [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
- **Difficulty:** Easy
- **Language:** Java
- **Status:** Accepted ✅

## 📝 Problem Statement
Given a string `s` containing only `(`, `)`, `{`, `}`, `[` and `]`, determine whether the brackets are valid.

A string is valid when:
1. Every opening bracket is closed by the same type.
2. Brackets close in the correct order.
3. Every closing bracket has a matching opening bracket.

## 💡 Approach
1. Create a stack to store opening brackets.
2. Push each opening bracket onto the stack.
3. For a closing bracket, return `false` if the stack is empty.
4. Pop the latest opening bracket and check that the types match.
5. Return `true` only if the stack is empty at the end.

## 💻 Solution
See [`Solution.java`](Solution.java).

## ⏱️ Complexity Analysis
- **Time Complexity:** `O(n)` — each character is processed once.
- **Space Complexity:** `O(n)` — the stack can store up to `n` characters.

## 📚 Key Learning
- A stack follows **LIFO** (Last In, First Out).
- `push()` adds an item, `pop()` removes the top item, and `isEmpty()` checks whether the stack is empty.

---
✨ **Day 13 of my coding journey — learning, practicing, and improving one problem at a time!**
