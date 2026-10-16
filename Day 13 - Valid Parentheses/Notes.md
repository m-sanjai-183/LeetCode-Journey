# 📝 Notes — LeetCode 20: Valid Parentheses

## 🎯 Goal
Check that every opening bracket has a matching closing bracket in the correct order.

## 🧠 Logic
- If the character is `(`, `{`, or `[`, push it onto the stack.
- Otherwise, it is a closing bracket:
  - If the stack is empty, return `false`.
  - Pop the most recent opening bracket.
  - Check that the opening and closing brackets match.
- After processing the string, return `true` only if the stack is empty.

## 🔍 Dry Run 1
**Input:** `s = "()[]{}"`

| Character | Action | Stack |
|---|---|---|
| `(` | Push | `(` |
| `)` | Matches `(`; pop | Empty |
| `[` | Push | `[` |
| `]` | Matches `[`; pop | Empty |
| `{` | Push | `{` |
| `}` | Matches `{`; pop | Empty |

**Output:** `true`

## 🔍 Dry Run 2
**Input:** `s = "(]"`

| Character | Action | Stack |
|---|---|---|
| `(` | Push | `(` |
| `]` | Does not match `(` | Return `false` |

**Output:** `false`

## 🔑 Java Concepts
- `Stack<Character>` stores bracket characters.
- `push(c)` adds a character to the top.
- `pop()` removes and returns the top character.
- `isEmpty()` checks whether the stack contains no items.
- `toCharArray()` lets us process a string one character at a time.

## ⏱️ Complexity
- **Time:** `O(n)`
- **Space:** `O(n)`

## ✅ Key Takeaway
A stack is useful for matching brackets because the most recently opened bracket must be closed first.
