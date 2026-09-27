# 🚀 LeetCode 19 — Remove Nth Node From End of List

## 𝗣𝗿𝗼𝗯𝗹𝗲𝗺

Given the head of a singly linked list, remove the `nᵗʰ` node from the end of the list and return its head.

### 𝗘𝘅𝗮𝗺𝗽𝗹𝗲

**Input:**
`head = [1,2,3,4,5], n = 2`

**Output:**
`[1,2,3,5]`

The `2ⁿᵈ` node from the end is `4`, so it is removed.

---

## 𝗔𝗽𝗽𝗿𝗼𝗮𝗰𝗵

✦ Use a **𝗗𝘂𝗺𝗺𝘆 𝗡𝗼𝗱𝗲** before the head.

✦ Maintain two pointers: `p` and `q`.

✦ Move `q` forward by `n` positions.

✦ Move both pointers together until `q` reaches the last node.

✦ Now `p` is positioned just before the node that must be removed.

✦ Skip the target node using:

`p.next = p.next.next`

✦ Return `d.next` as the new head.

---

## 𝗘𝘅𝗮𝗺𝗽𝗹𝗲

```text
1 → 2 → 3 → 4 → 5
            ↑
          Remove

Result:

1 → 2 → 3 → 5
