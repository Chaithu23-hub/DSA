class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0)
            return result;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        // Continue the spiral until all bounds collapse
        while(top <= bottom && left <= right) {

            // Move Left to Right on the top row
            for(int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++; // shrink the top bound

            // Move Top to Bottom on the rightmost column
            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // shrink the right bound

            // Move Right to Left on the bottom row (if still within bounds)
            if(top <= bottom) {
                for(int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--; // shrink the bottom bound
            }

            // Move Bottom to Top on the leftmost column (if still within bounds)
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // shrink the left bound
            }
        }
        return result;
    }
}


/*
54. Spiral Matrix
Medium
Topics
premium lock icon
Companies
Hint
Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
  */
