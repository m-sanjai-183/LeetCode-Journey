# 📝 Notes — LeetCode 342: Power of Four

## 🎯 Goal
Check whether an integer is a power of four.

Examples of powers of four:
`1, 4, 16, 64, 256, 1024, ...`

Each number is obtained by multiplying the previous number by `4`.

## 🧠 Logic
1. **Check `n <= 0`:** return `false`, because powers of four are positive.
2. **Check `n % 4 == 0`:** if the remainder is zero, `n` is divisible by four.
3. **Divide using `n = n / 4`:** keep reducing the number while it is divisible by four.
4. **Return `n == 1`:** a valid power of four eventually becomes `1`.

## 🔍 Dry Run 1
**Input:** `n = 16`

| Step | `n` | Condition | Action |
|---|---:|---|---|
| 1 | 16 | `16 % 4 == 0` | `n = 16 / 4 = 4` |
| 2 | 4 | `4 % 4 == 0` | `n = 4 / 4 = 1` |
| 3 | 1 | `1 % 4 != 0` | Stop loop |
| Final | 1 | `n == 1` | Return `true` |

## 🔍 Dry Run 2
**Input:** `n = 5`

| Step | `n` | Condition | Action |
|---|---:|---|---|
| 1 | 5 | `5 % 4 != 0` | Stop loop |
| Final | 5 | `n != 1` | Return `false` |

## 🔑 Important Java Operators
- `<=` — less than or equal to
- `%` — gives the remainder
- `/` — integer division for integers
- `==` — checks equality
- `&&` is not required for this solution

## ⏱️ Complexity
- **Time:** `O(log₄ n)`
- **Space:** `O(1)`

## ✅ Key Takeaway
Repeatedly divide a positive number by `4`. If it becomes exactly `1`, it is a power of four.
