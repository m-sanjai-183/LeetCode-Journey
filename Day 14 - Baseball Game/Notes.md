# 📝 Notes — LeetCode 682: Baseball Game

## 🎯 Goal
Apply each operation to the score record and return the sum of the final scores.

## 🧠 Operation Rules
- **Integer (`x`):** Add `x` as a new score.
- **`+`:** Add the sum of the previous two scores.
- **`D`:** Add double the previous score.
- **`C`:** Remove the previous score.

## 🔍 Dry Run
**Input:** `operations = ["5", "2", "C", "D", "+"]`

| Operation | Action | Scores |
|---|---|---|
| `"5"` | Add 5 | `[5]` |
| `"2"` | Add 2 | `[5, 2]` |
| `"C"` | Remove 2 | `[5]` |
| `"D"` | Add double 5 (10) | `[5, 10]` |
| `"+"` | Add 5 + 10 = 15 | `[5, 10, 15]` |

**Final sum:** `5 + 10 + 15 = 30`

## 🔑 Java Concepts
- `ArrayList<Integer>` stores the scores.
- `scores.size()` returns the number of scores.
- `scores.get(index)` accesses a score.
- `scores.add(value)` appends a score.
- `scores.remove(index)` removes a score.
- `Integer.parseInt(op)` converts a numeric string to an integer.

## ⏱️ Complexity
- **Time:** `O(n)`
- **Space:** `O(n)`

## ✅ Key Takeaway
Process operations in order, update the score list, then add all remaining scores.
