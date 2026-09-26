# LeetCode 169 - Majority Element

✦ **Problem:** Majority Element  
✦ **LeetCode Number:** 169  
✦ **Difficulty:** Easy  
✦ **Language:** Java  
✦ **Topic:** Array, Sorting, Counting

## 📌 Problem

Given an array `nums` of size `n`, return the **majority element**.

The majority element is the element that appears more than `⌊n / 2⌋` times.

You may assume that the majority element always exists in the array.

## 💡 Approach

✦ First, sort the array using `Arrays.sort()`.

✦ After sorting, equal elements will be placed next to each other.

✦ Use a `count` variable to count consecutive occurrences.

✦ Whenever the current number changes, reset the count to `1`.

✦ Keep track of the maximum frequency using `max`.

✦ Store the corresponding element in `max_num`.

✦ Finally, return `max_num`.

## 🔍 Example

### Input

```text
nums = [3,2,3]
