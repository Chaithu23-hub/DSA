class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        // maxProd and minProd track the maximum/minimum product ending at the previous index
        int maxProd = nums[0];
        int minProd = nums[0];
        int result  = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            
            // When num is negative, swapping maxProd and minProd
            // ensures maxProd stays the maximum and minProd the minimum
            if (num < 0) {
                int tmp = maxProd;
                maxProd = minProd;
                minProd = tmp;
            }

            // Either start fresh from nums[i], or extend the previous product
            maxProd = Math.max(num, maxProd * num);
            minProd = Math.min(num, minProd * num);

            // Update global maximum
            result = Math.max(result, maxProd);
        }

        return result;
    }
}
