Notes — LeetCode 896: Monotonic Array

1. Problem Understanding

We need to check whether an array is:

Monotone Increasing

Monotone Decreasing

If either condition is satisfied, return true.

Otherwise, return false.

2. Important Concept

Monotone Increasing

For every adjacent element:

nums[i] <= nums[i + 1]

Example:

[1,2,2,3]

Monotone Decreasing

For every adjacent element:

nums[i] >= nums[i + 1]

Example:

[6,5,4,4]

3. Logic

Start with:

boolean increasing = true;
boolean decreasing = true;

Assume the array is both increasing and decreasing.

Then compare every adjacent pair.

If:

nums[i] > nums[i + 1]

It is not increasing:

increasing = false;

If:

nums[i] < nums[i + 1]

It is not decreasing:

decreasing = false;

At the end:

return increasing || decreasing;

4. Dry Run

Input

[1,2,2,3]

Step 1

1 <= 2

Increasing is possible.

Step 2

2 <= 2

Still increasing.

Step 3

2 <= 3

Still increasing.

Therefore:

increasing = true

Result:

true

5. Why ||?

The array only needs to be:

Increasing OR Decreasing

Therefore:

increasing || decreasing

If either one is true, the array is monotonic.

6. Complexity

Time Complexity

We check each element once:

O(n)

Space Complexity

Only two boolean variables are used:

O(1)

7. Key Takeaway

Instead of checking only one direction, check both increasing and decreasing possibilities.

Increasing ↗️
      OR
Decreasing ↘️

This gives a simple and efficient solution.
