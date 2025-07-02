class Solution {
    public int singleNumber(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            index=index^nums[i];
        }
        return index;
    }
}

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]

Output: 1

 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.


👉Approach : XOR Operation
Why XOR works:
1. XOR of a number with itself is 0 (a ^ a = 0 , any number XOR with itself is zero)
2 . XOR of a number with 0 is the number itself (a ^ 0 = a),any number XOR with zero is the number itself
3 . XOR is commutative and associative (order doesn't matter)

🔧 Steps (in code)
1 . Initialize a variable index to 0.
2 . Iterate through the array.
3 . For each number nums[i], compute index = index ^ nums[i].
4 . After the loop, index will hold the single number.

Example Walkthrough🔍
Let's take the array: [4, 1, 2, 1, 2]

Step-by-Step Execution:
Initialize index = 0

1 . index = 0 ^ 4 = 4

Binary: 0000 ^ 0100 = 0100
2 . index = 4 ^ 1 = 5

Binary: 0100 ^ 0001 = 0101
3 . index = 5 ^ 2 = 7

Binary: 0101 ^ 0010 = 0111
4 . index = 7 ^ 1 = 6

Binary: 0111 ^ 0001 = 0110
5 . index = 6 ^ 2 = 4

Binary: 0110 ^ 0010 = 0100
Final result: 4

Why This Works
All duplicate numbers cancel each other out (a ^ a = 0), and the single number remains because 0 ^ a = a.*/
