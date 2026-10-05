# 🚀 LeetCode 896 — Monotonic Array

## 🧩 Problem

Given an integer array `nums`, return `true` if the array is **monotonic**, otherwise return `false`.

An array is monotonic if it is either:

- 📈 Monotone Increasing
- 📉 Monotone Decreasing

### 💡 Examples

```text
Input:  nums = [1,2,2,3]
Output: true
```

```text
Input:  nums = [6,5,4,4]
Output: true
```

```text
Input:  nums = [1,3,2]
Output: false
```

## 🧠 Approach

We use two boolean variables:

- `increasing` → checks whether the array is increasing.
- `decreasing` → checks whether the array is decreasing.

For every adjacent pair:

- If `nums[i] > nums[i + 1]`, the array cannot be increasing.
- If `nums[i] < nums[i + 1]`, the array cannot be decreasing.

Finally:

```java
return increasing || decreasing;
```

If either condition is still true, the array is monotonic.

## ⏱️ Complexity

- ⏱️ Time Complexity: **O(n)**
- 💾 Space Complexity: **O(1)**

## 💻 Language

**Java ☕**

## 🎯 LeetCode

**Problem 896 — Monotonic Array**

---

⭐ Practicing one problem at a time and improving my Java + DSA skills!
