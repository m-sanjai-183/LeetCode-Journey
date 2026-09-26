# LeetCode 145 — Binary Tree Postorder Traversal 🌳

## 📌 Problem

Given the `root` of a binary tree, return the **postorder traversal** of its nodes' values.

### Traversal Order

Left → Right → Root

📝 Example 1

Input
root = [1,null,2,3]
Output
[3,2,1]
Explanation

The binary tree is:

    1
     \
      2
     /
    3

Following Left → Right → Root:

3 → 2 → 1

Therefore:

[3,2,1]

💡 Approach

We solve the problem using recursion.

For every node:

Traverse the left subtree.
Traverse the right subtree.
Add the current node's value to the list.
Logic
postorder(root)

    ↓
Traverse Left

    ↓
Traverse Right

    ↓
Add Root

💻 Java Solution

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        postorder(root, list);

        return list;
    }

    void postorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);
    }
}

⏱️ Complexity

Time Complexity: O(n)
Space Complexity: O(h)

Where:

n = number of nodes
h = height of the binary tree

🔑 Key Concept

Postorder Traversal
Left → Right → Root
Easy Memory Trick
Preorder  → Root → Left → Right
Inorder   → Left → Root → Right
Postorder → Left → Right → Root

🎯 Key Takeaway

In postorder traversal, the root node is processed last after completely traversing both the left and right subtrees.

🏆 LeetCode

Problem: 145. Binary Tree Postorder Traversal
Difficulty: Easy
Language: Java
Topic: Binary Tree / Recursion / DFS
