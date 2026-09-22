# Notes — LeetCode 145: Binary Tree Postorder Traversal

## 📌 Problem

Given the `root` of a binary tree, return the **postorder traversal** of its nodes' values.

---

## 🔹 What is Postorder Traversal?

Postorder traversal follows:

```text
Left → Right → Root
Easy Memory Trick
POST → Root comes at the END
🌳 Example

Given:

    1
     \
      2
     /
    3

Postorder traversal:

3 → 2 → 1

Output:

[3,2,1]
💡 Approach

We use recursion.

For every node:

Traverse the left subtree.
Traverse the right subtree.
Add the current node's value.
Logic
If root == null
    return

postorder(left)
postorder(right)
add root
🔹 Base Condition
if (root == null) {
    return;
}
Why?

If the current node is null, there is no node to process.

So we simply return.

🔹 Recursive Calls
1. Traverse Left
postorder(root.left, list);

This processes all nodes in the left subtree.

2. Traverse Right
postorder(root.right, list);

This processes all nodes in the right subtree.

3. Add Root
list.add(root.val);

The current node is added after both subtrees.

🔄 Step-by-Step

For:

    1
     \
      2
     /
    3
Start at 1
1

Go left:

null → return

Go right:

2

From 2, go left:

3

Node 3 has no children.

Add 3:

[3]

Return to 2.

Add 2:

[3,2]

Return to 1.

Add 1:

[3,2,1]
Final Output
[3,2,1]
💻 Important Java Code
void postorder(TreeNode root, List<Integer> list) {
    if (root == null) {
        return;
    }

    postorder(root.left, list);
    postorder(root.right, list);
    list.add(root.val);
}
📚 Java Concepts Used
List<Integer>

Stores the traversal result.

List<Integer> list = new ArrayList<>();
root.left

Accesses the left child.

root.right

Accesses the right child.

root.val

Gets the value of the current node.

Recursion

A method calls itself to process smaller parts of the tree.

⚡ Traversal Comparison
Traversal	Order
Preorder	Root → Left → Right
Inorder	Left → Root → Right
Postorder	Left → Right → Root
Memory Trick
PRE  → Root First
IN   → Root Middle
POST → Root Last
⏱️ Complexity
Time Complexity
O(n)

Every node is visited once.

Space Complexity
O(h)

h is the height of the binary tree because recursion uses the call stack.

🎯 Key Takeaways
Postorder means Left → Right → Root.
Use recursion to traverse the tree.
Check root == null as the base condition.
Visit the left subtree first.
Visit the right subtree second.
Add the root value last.
⭐ Remember
POSTORDER
    ↓
LEFT
    ↓
RIGHT
    ↓
ROOT
