# Notes — LeetCode 896: Monotonic Array

## 1. Problem Understanding

We need to check whether an array is:

1. Monotone Increasing
2. Monotone Decreasing

If either condition is satisfied, return `true`.

Otherwise, return `false`.

---

## 2. Important Concept

### Monotone Increasing

For every adjacent element:

```text
nums[i] <= nums[i + 1]
```

Example:

```text
[1,2,2,3]
```

### Monotone Decreasing

For every adjacent element:

```text
nums[i] >= nums[i + 1]
```

Example:

```text
[6,5,4,4]
```

---

## 3. Logic

Start with:

```java
boolean increasing = true;
boolean decreasing = true;
```

Assume the array is both increasing and decreasing.

Then compare every adjacent pair.

### If:

```java
nums[i] > nums[i + 1]
```

It is not increasing:

```java
increasing = false;
```

### If:

```java
nums[i] < nums[i + 1]
```

It is not decreasing:

```java
decreasing = false;
```

At the end:

```java
return increasing || decreasing;
```

---

## 4. Dry Run

### Input

```text
[1,2,2,3]
```

### Step 1

```text
1 <= 2
```

Increasing is possible.

### Step 2

```text
2 <= 2
```

Still increasing.

### Step 3

```text
2 <= 3
```

Still increasing.

Therefore:

```text
increasing = true
```

Result:

```text
true
```

---

## 5. Why `||`?

The array only needs to be:

```text
Increasing OR Decreasing
```

Therefore:

```java
increasing || decreasing
```

If either one is `true`, the array is monotonic.

---

## 6. Complexity

### Time Complexity

We check each element once:

```text
O(n)
```

### Space Complexity

Only two boolean variables are used:

```text
O(1)
```

---

## 7. Key Takeaway

Instead of checking only one direction, check **both increasing and decreasing** possibilities.

```text
Increasing ↗️
      OR
Decreasing ↘️
```

This gives a simple and efficient solution.

