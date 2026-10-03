Notes — LeetCode 217: Contains Duplicate

Topic

HashSet in Java

Main Idea

A HashSet stores unique values.

For every number in the array:

Check whether the number is already in the HashSet.

If yes → duplicate found → return true.

If no → add the number to the set.

After checking all numbers → return false.

Important Syntax

HashSet<Integer> set = new HashSet<>();

Creates a HashSet that stores Integer values.

set.contains(num)

Checks whether num is already present.

set.add(num)

Adds num to the set.

Example

For:

nums = [1, 2, 3, 1]

The set changes like this:

1 → {1}
2 → {1,2}
3 → {1,2,3}
1 → already exists → duplicate

Therefore:

Output: true

Complexity

Time: O(n) average
Space: O(n)

Key Learning

HashSet is useful when we need to quickly check whether an element has already appeared.
