Notes — Linked List Cycle

🧠 Main Idea

We use two pointers:

slow → moves 1 step
fast → moves 2 steps

💡 Why It Works

If the linked list has a cycle, the fast pointer will eventually catch the slow pointer.

If there is no cycle, fast will reach null.

⚠️ Important Condition

while (fast != null && fast.next != null)

This prevents a NullPointerException.

🔄 Steps

Set slow = head.
Set fast = head.
Move slow by one step.
Move fast by two steps.
If slow == fast, return true.
If the loop ends, return false.

🧪 Example

3 → 2 → 0 → -4
    ↑         ↓
    └─────────┘

The last node points back to 2, so a cycle exists.

Output

true
⏱️ Complexity

Time  : O(n)
Space : O(1)
🔑 Key Concept

Floyd's Cycle Detection Algorithm = Slow + Fast Pointers 🐢🐇

slow → 1 step
fast → 2 steps

If they meet → Cycle exists ✅
