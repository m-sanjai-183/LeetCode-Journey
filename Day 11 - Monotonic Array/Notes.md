# 📝 Notes — LeetCode 896: Monotonic Array

## 🔑 Key Concept

A **monotonic array** moves in only one direction:

📈 Increasing:
```text
1 → 2 → 2 → 3
```

📉 Decreasing:
```text
6 → 5 → 4 → 4
```

❌ Not monotonic:
```text
1 → 3 → 2
```

## 🧠 Logic

Start with:

```java
boolean increasing = true;
boolean decreasing = true;
```

Then compare every adjacent element.

### 📈 Check Increasing

```java
if (nums[i] > nums[i + 1]) {
    increasing = false;
}
```

If the current element is greater than the next element, the array is not increasing.

### 📉 Check Decreasing

```java
if (nums[i] < nums[i + 1]) {
    decreasing = false;
}
```

If the current element is smaller than the next element, the array is not decreasing.

### ✅ Final Check

```java
return increasing || decreasing;
```

If the array is either increasing OR decreasing, return `true`.

## 🔍 Important Point

Equal values are allowed.

Example:

```text
[1, 2, 2, 3]  → Increasing ✅
[6, 5, 4, 4]  → Decreasing ✅
```

Because monotonic arrays allow:

- `nums[i] <= nums[i+1]` for increasing
- `nums[i] >= nums[i+1]` for decreasing

## ⏱️ Complexity

| Complexity | Value |
|---|---|
| Time | O(n) |
| Space | O(1) |

## 🎯 What I Learned

- 🔹 Comparing adjacent array elements
- 🔹 Using boolean flags
- 🔹 Understanding monotonic sequences
- 🔹 Efficient O(n) array traversal
- 🔹 Writing clean Java logic

