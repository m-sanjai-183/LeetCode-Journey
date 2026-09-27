
---

# 📝 `Notes.md`

```markdown
# 📝 Notes — LeetCode 19

## 𝗣𝗿𝗼𝗯𝗹𝗲𝗺

Remove the `nᵗʰ` node from the end of a singly linked list.

---

## 𝗞𝗲𝘆 𝗜𝗱𝗲𝗮

✦ Use **two pointers**.

✦ Keep a gap of `n` nodes between the two pointers.

✦ When the second pointer reaches the end, the first pointer will be just before the target node.

✦ Remove the target node by changing the `next` reference.

---

## 𝗪𝗵𝘆 𝗗𝘂𝗺𝗺𝘆 𝗡𝗼𝗱𝗲?

A dummy node is placed before the head:

```text
Dummy → 1 → 2 → 3 → 4 → 5
