class LinearSearch {
    public static int linearSearch(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; // Found, return index
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int nums[] = {2, -4, 4, 0, 10};
        int target = 4;  // ✅ Provide the target value here
        int result = linearSearch(nums, target);
        System.out.println(result);
    }
}
