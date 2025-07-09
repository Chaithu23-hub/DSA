class Solution {
    public int[] searchRange(int[] nums, int target) {
        // Find the first occurrence of the target
        int firstIndex = findPosition(nums, target, true);
        // Find the last occurrence of the target
        int lastIndex = findPosition(nums, target, false);

        // Return both as an array
        return new int[]{firstIndex, lastIndex};
    }

    // This method finds either the first or last position of the target
    private int findPosition(int[] nums, int target, boolean findFirst) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;  // Default value if target is not found

        // Standard binary search loop
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                result = mid;  // Found the target, save the index

                // Now check if we need to find the first or last occurrence
                if (findFirst) {
                    end = mid - 1; // Move left to find the first occurrence
                } else {
                    start = mid + 1; // Move right to find the last occurrence
                }
            } else if (nums[mid] < target) {
                start = mid + 1; // Target is in the right half
            } else {
                end = mid - 1; // Target is in the left half
            }
        }

        return result;
    }
}





/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109 */
