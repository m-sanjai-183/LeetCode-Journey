LeetCode Day 10 — Contains Duplicate

Problem

LeetCode 217 — Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Approach

Use a Java HashSet to store the elements that have already been seen.

If an element is already present in the set, a duplicate exists → return true.

Otherwise, add the element to the set.

If the loop finishes without finding a duplicate → return false.

Java Solution

The solution uses HashSet<Integer> for efficient duplicate detection.

Complexity

Time: O(n) average

Space: O(n)

Example

Input:  nums = [1,2,3,1]
Output: true

Input:  nums = [1,2,3,4]
Output: false

LeetCode

Problem: 217. Contains Duplicate
Difficulty: Easy
Language: Java

Day 10 of my LeetCode Journey 🚀

Continuing to improve my Java and Data Structures & Algorithms skills one problem at a time.
